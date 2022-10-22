package typingsJapgolly.firebaseComponent

import typingsJapgolly.firebaseAppTypes.mod.FirebaseApp
import typingsJapgolly.firebaseComponent.distSrcComponentMod.Component
import typingsJapgolly.firebaseComponent.distSrcTypesMod.InstanceFactory
import typingsJapgolly.firebaseComponent.distSrcTypesMod.InstantiationMode
import typingsJapgolly.firebaseComponent.firebaseComponentStrings.badtest
import typingsJapgolly.firebaseComponent.firebaseComponentStrings.fireball
import typingsJapgolly.firebaseComponent.firebaseComponentStrings.rocket
import typingsJapgolly.firebaseComponent.firebaseComponentStrings.ship
import typingsJapgolly.firebaseComponent.firebaseComponentStrings.test
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTestUtilMod {
  
  @JSImport("@firebase/component/dist/test/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getFakeApp(): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")().asInstanceOf[FirebaseApp]
  inline def getFakeApp(appName: String): FirebaseApp = ^.asInstanceOf[js.Dynamic].applyDynamic("getFakeApp")(appName.asInstanceOf[js.Any]).asInstanceOf[FirebaseApp]
  
  inline def getFakeComponent_badtest(name: badtest, factory: InstanceFactory[badtest]): Component[badtest] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Component[badtest]]
  inline def getFakeComponent_badtest(name: badtest, factory: InstanceFactory[badtest], multipleInstance: Boolean): Component[badtest] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any])).asInstanceOf[Component[badtest]]
  inline def getFakeComponent_badtest(
    name: badtest,
    factory: InstanceFactory[badtest],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[badtest] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[badtest]]
  inline def getFakeComponent_badtest(
    name: badtest,
    factory: InstanceFactory[badtest],
    multipleInstance: Unit,
    instantiationMode: InstantiationMode
  ): Component[badtest] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[badtest]]
  
  inline def getFakeComponent_fireball(name: fireball, factory: InstanceFactory[fireball]): Component[fireball] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Component[fireball]]
  inline def getFakeComponent_fireball(name: fireball, factory: InstanceFactory[fireball], multipleInstance: Boolean): Component[fireball] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any])).asInstanceOf[Component[fireball]]
  inline def getFakeComponent_fireball(
    name: fireball,
    factory: InstanceFactory[fireball],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[fireball] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[fireball]]
  inline def getFakeComponent_fireball(
    name: fireball,
    factory: InstanceFactory[fireball],
    multipleInstance: Unit,
    instantiationMode: InstantiationMode
  ): Component[fireball] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[fireball]]
  
  inline def getFakeComponent_rocket(name: rocket, factory: InstanceFactory[rocket]): Component[rocket] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Component[rocket]]
  inline def getFakeComponent_rocket(name: rocket, factory: InstanceFactory[rocket], multipleInstance: Boolean): Component[rocket] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any])).asInstanceOf[Component[rocket]]
  inline def getFakeComponent_rocket(
    name: rocket,
    factory: InstanceFactory[rocket],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[rocket] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[rocket]]
  inline def getFakeComponent_rocket(
    name: rocket,
    factory: InstanceFactory[rocket],
    multipleInstance: Unit,
    instantiationMode: InstantiationMode
  ): Component[rocket] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[rocket]]
  
  inline def getFakeComponent_ship(name: ship, factory: InstanceFactory[ship]): Component[ship] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Component[ship]]
  inline def getFakeComponent_ship(name: ship, factory: InstanceFactory[ship], multipleInstance: Boolean): Component[ship] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any])).asInstanceOf[Component[ship]]
  inline def getFakeComponent_ship(
    name: ship,
    factory: InstanceFactory[ship],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[ship] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[ship]]
  inline def getFakeComponent_ship(
    name: ship,
    factory: InstanceFactory[ship],
    multipleInstance: Unit,
    instantiationMode: InstantiationMode
  ): Component[ship] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[ship]]
  
  inline def getFakeComponent_test(name: test, factory: InstanceFactory[test]): Component[test] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Component[test]]
  inline def getFakeComponent_test(name: test, factory: InstanceFactory[test], multipleInstance: Boolean): Component[test] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any])).asInstanceOf[Component[test]]
  inline def getFakeComponent_test(
    name: test,
    factory: InstanceFactory[test],
    multipleInstance: Boolean,
    instantiationMode: InstantiationMode
  ): Component[test] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[test]]
  inline def getFakeComponent_test(
    name: test,
    factory: InstanceFactory[test],
    multipleInstance: Unit,
    instantiationMode: InstantiationMode
  ): Component[test] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFakeComponent")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any], multipleInstance.asInstanceOf[js.Any], instantiationMode.asInstanceOf[js.Any])).asInstanceOf[Component[test]]
}
