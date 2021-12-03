package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	public void getDatastore() {
//		try {
//			Datastore datastore = DatastoreOptions.getDefaultInstance().getService();
//			String namespace = "amp";
//			String kind = "accessProvision";
//			String name = "projectTypes";
//			Key taskKey = datastore.newKeyFactory().setNamespace(namespace).setKind(kind).newKey(name);
//			// Entity task = Entity.newBuilder(taskKey)
//			// .set("description", "Buy milk")
//			// .build();
//			// datastore.put(task);
//			// System.out.printf("Saved %s: %s%n", task.getKey().getName(),
//			// task.getString("description"));
//			Entity retrieved = datastore.get(taskKey);
////            System.out.println(retrieved.getList("environments").getClass().getName());
//			// List<Value<?>> list = retrieved.getList("environments");
////			 Map<String, Value<?>> properties = retrieved.getProperties();
////			 System.err.println(properties);
////			Value<?> value = properties.get(name);
////			System.out.println(value.get());
////			
////			Object obj = value.get();
//
//			FullEntity<IncompleteKey> entity = retrieved.getEntity(name);
//			Map<String, Value<?>> properties = entity.getProperties();
//			Set<String> keySet = properties.keySet();
//			System.out.println(properties);
//			System.err.println(properties.values());
//			Collection<Value<?>> values = properties.values();
//
//			System.err.println(keySet + "----");
//
//			Map<Object, Object> finalResult = new HashMap<>();
//
//			int sizeOfKeySet = keySet.size();
//			int i = 0;
//
////			for (int i = 0; i < sizeOfKeySet-1; i++) {
////				finalResult.put(keySet[i], value.get());
////			}
//
//			List listOfKeys = new ArrayList<>();
//
//			for (String value2 : keySet) {
//				listOfKeys.add(value2);
//			}
//
//			for (Value<?> value : values) {
//				for (int j = 0; j < listOfKeys.size(); j++) {
//					finalResult.put(listOfKeys.get(j), value.get());
//				}
//			}
//
//			System.out.println("=============" + finalResult);
//
////			for (Value<?> value : list) {
////				System.err.println(value.get());
////			}
////            System.out.printf("Retrieved %s:", taskKey.getName());
//
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}

}
