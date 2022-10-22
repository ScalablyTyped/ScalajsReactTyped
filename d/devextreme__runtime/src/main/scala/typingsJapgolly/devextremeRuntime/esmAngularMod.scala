package typingsJapgolly.devextremeRuntime

import org.scalajs.dom.HTMLElement
import typingsJapgolly.angularCore.mod.ElementRef
import typingsJapgolly.devextremeRuntime.anon.CurrentValue
import typingsJapgolly.devextremeRuntime.esmAngularTemplateMod.IModel
import typingsJapgolly.devextremeRuntime.esmAngularUpdateUndefinedFromDefaultsMod.DefaultEntries
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmAngularMod {
  
  @JSImport("@devextreme/runtime/esm/angular", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@devextreme/runtime/esm/angular", "UndefinedNativeElementRef")
  @js.native
  open class UndefinedNativeElementRef[T] ()
    extends typingsJapgolly.devextremeRuntime.esmAngularUndefinedNativeElementRefMod.UndefinedNativeElementRef[T]
  
  inline def getAttributes(element: ElementRef[HTMLElement]): Record[String, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAttributes")(element.asInstanceOf[js.Any]).asInstanceOf[Record[String, Any]]
  
  inline def hasTemplate(name: String, props: Record[String, Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasTemplate(name: String, props: Record[String, Any], _component: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasTemplate")(name.asInstanceOf[js.Any], props.asInstanceOf[js.Any], _component.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isSlotEmpty(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotEmpty")().asInstanceOf[Boolean]
  inline def isSlotEmpty(slot: ElementRef[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSlotEmpty")(slot.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def renderTemplate(template: Any, model: IModel): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def renderTemplate(template: Any, model: IModel, component: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("renderTemplate")(template.asInstanceOf[js.Any], model.asInstanceOf[js.Any], component.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def updateUndefinedFromDefaults(
    componentInstance: Record[String, Any],
    changes: Record[String, CurrentValue],
    defaultEntries: DefaultEntries
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateUndefinedFromDefaults")(componentInstance.asInstanceOf[js.Any], changes.asInstanceOf[js.Any], defaultEntries.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
