package typingsJapgolly.rcFieldForm.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcFieldForm.anon.Metadestroybooleanundefin
import typingsJapgolly.rcFieldForm.anon.Source
import typingsJapgolly.rcFieldForm.esFieldMod.ChildProps
import typingsJapgolly.rcFieldForm.esFieldMod.ShouldUpdate
import typingsJapgolly.rcFieldForm.esInterfaceMod.EventArgs
import typingsJapgolly.rcFieldForm.esInterfaceMod.FormInstance
import typingsJapgolly.rcFieldForm.esInterfaceMod.Meta
import typingsJapgolly.rcFieldForm.esInterfaceMod.NamePath
import typingsJapgolly.rcFieldForm.esInterfaceMod.Rule
import typingsJapgolly.rcFieldForm.esInterfaceMod.Store
import typingsJapgolly.rcFieldForm.esInterfaceMod.StoreValue
import typingsJapgolly.rcFieldForm.rcFieldFormBooleans.`false`
import typingsJapgolly.rcFieldForm.rcFieldFormStrings.parallel
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_FieldProps1604101356[Values] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def children(
    value: Element | (js.Function3[/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values], Node])
  ): this.type = set("children", value.asInstanceOf[js.Any])
  
  inline def childrenFunction3(value: (/* control */ ChildProps, /* meta */ Meta, /* form */ FormInstance[Values]) => Node): this.type = set("children", js.Any.fromFunction3(value))
  
  inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
  
  inline def dependencies(value: js.Array[NamePath]): this.type = set("dependencies", value.asInstanceOf[js.Any])
  
  inline def dependenciesVarargs(value: NamePath*): this.type = set("dependencies", js.Array(value*))
  
  inline def getValueFromEvent(value: /* args */ EventArgs => StoreValue): this.type = set("getValueFromEvent", js.Any.fromFunction1(value))
  
  inline def getValueProps(value: /* value */ StoreValue => Record[String, Any]): this.type = set("getValueProps", js.Any.fromFunction1(value))
  
  inline def initialValue(value: Any): this.type = set("initialValue", value.asInstanceOf[js.Any])
  
  inline def isList(value: Boolean): this.type = set("isList", value.asInstanceOf[js.Any])
  
  inline def isListField(value: Boolean): this.type = set("isListField", value.asInstanceOf[js.Any])
  
  inline def messageVariables(value: Record[String, String]): this.type = set("messageVariables", value.asInstanceOf[js.Any])
  
  inline def name(value: NamePath): this.type = set("name", value.asInstanceOf[js.Any])
  
  inline def nameVarargs(value: (String | Double)*): this.type = set("name", js.Array(value*))
  
  inline def normalize(value: (/* value */ StoreValue, /* prevValue */ StoreValue, /* allValues */ Store) => StoreValue): this.type = set("normalize", js.Any.fromFunction3(value))
  
  inline def onMetaChange(value: /* meta */ Metadestroybooleanundefin => Callback): this.type = set("onMetaChange", js.Any.fromFunction1((t0: /* meta */ Metadestroybooleanundefin) => value(t0).runNow()))
  
  inline def onReset(value: Callback): this.type = set("onReset", value.toJsFn)
  
  inline def preserve(value: Boolean): this.type = set("preserve", value.asInstanceOf[js.Any])
  
  inline def rules(value: js.Array[Rule]): this.type = set("rules", value.asInstanceOf[js.Any])
  
  inline def rulesVarargs(value: Rule*): this.type = set("rules", js.Array(value*))
  
  inline def shouldUpdate(value: ShouldUpdate[Values]): this.type = set("shouldUpdate", value.asInstanceOf[js.Any])
  
  inline def shouldUpdateFunction3(value: (Values, Values, /* info */ Source) => Boolean): this.type = set("shouldUpdate", js.Any.fromFunction3(value))
  
  inline def trigger(value: String): this.type = set("trigger", value.asInstanceOf[js.Any])
  
  inline def validateFirst(value: Boolean | parallel): this.type = set("validateFirst", value.asInstanceOf[js.Any])
  
  inline def validateTrigger(value: String | js.Array[String] | `false`): this.type = set("validateTrigger", value.asInstanceOf[js.Any])
  
  inline def validateTriggerVarargs(value: String*): this.type = set("validateTrigger", js.Array(value*))
  
  inline def valuePropName(value: String): this.type = set("valuePropName", value.asInstanceOf[js.Any])
}
