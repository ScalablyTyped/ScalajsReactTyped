package typingsJapgolly.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "NgModuleRef")
@js.native
abstract class NgModuleRef[T] () extends js.Object {
  /**
    * The ComponentFactoryResolver to get hold of the ComponentFactories
    * declared in the `entryComponents` property of the module.
    */
  val componentFactoryResolver: ComponentFactoryResolver = js.native
  /**
    * The injector that contains all of the providers of the NgModule.
    */
  val injector: Injector = js.native
  /**
    * The NgModule instance.
    */
  val instance: T = js.native
  /**
    * Destroys the module instance and all of the data structures associated with it.
    */
  def destroy(): Unit = js.native
  /**
    * Allows to register a callback that will be called when the module is destroyed.
    */
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}

