package typingsJapgolly.reactSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactSelect.distDeclarationsSrcAsyncCreatableMod.AsyncCreatableProps
import typingsJapgolly.reactSelect.distDeclarationsSrcSelectMod.default
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.Options
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.OptionsOrGroups
import typingsJapgolly.reactSelect.distDeclarationsSrcTypesMod.PropsValue
import typingsJapgolly.reactSelect.distDeclarationsSrcUseCreatableMod.Accessors
import typingsJapgolly.reactSelect.reactSelectBooleans.`false`
import typingsJapgolly.reactSelect.reactSelectStrings.first
import typingsJapgolly.reactSelect.reactSelectStrings.last
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AsyncCreatable {
  
  @JSImport("react-select/dist/declarations/src/AsyncCreatable", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default[Any, `false`, GroupBase[Any]]] {
    
    inline def allowCreateWhileLoading(value: Boolean): this.type = set("allowCreateWhileLoading", value.asInstanceOf[js.Any])
    
    inline def cacheOptions(value: Any): this.type = set("cacheOptions", value.asInstanceOf[js.Any])
    
    inline def createOptionPosition(value: first | last): this.type = set("createOptionPosition", value.asInstanceOf[js.Any])
    
    inline def defaultInputValue(value: String): this.type = set("defaultInputValue", value.asInstanceOf[js.Any])
    
    inline def defaultMenuIsOpen(value: Boolean): this.type = set("defaultMenuIsOpen", value.asInstanceOf[js.Any])
    
    inline def defaultOptions(value: (OptionsOrGroups[Any, GroupBase[Any]]) | Boolean): this.type = set("defaultOptions", value.asInstanceOf[js.Any])
    
    inline def defaultOptionsVarargs(value: (Any | GroupBase[Any])*): this.type = set("defaultOptions", js.Array(value*))
    
    inline def defaultValue(value: PropsValue[Any]): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def defaultValueNull: this.type = set("defaultValue", null)
    
    inline def defaultValueVarargs(value: Any*): this.type = set("defaultValue", js.Array(value*))
    
    inline def formatCreateLabel(value: /* inputValue */ String => Node): this.type = set("formatCreateLabel", js.Any.fromFunction1(value))
    
    inline def getNewOptionData(value: (/* inputValue */ String, /* optionLabel */ Node) => Any): this.type = set("getNewOptionData", js.Any.fromFunction2(value))
    
    inline def isLoading(value: Boolean): this.type = set("isLoading", value.asInstanceOf[js.Any])
    
    inline def isValidNewOption(
      value: (/* inputValue */ String, /* value */ Options[Any], /* options */ OptionsOrGroups[Any, GroupBase[Any]], /* accessors */ Accessors[Any]) => Boolean
    ): this.type = set("isValidNewOption", js.Any.fromFunction4(value))
    
    inline def loadOptions(
      value: (/* inputValue */ String, /* callback */ js.Function1[/* options */ OptionsOrGroups[Any, GroupBase[Any]], Unit]) => (js.Promise[OptionsOrGroups[Any, GroupBase[Any]]]) | Unit
    ): this.type = set("loadOptions", js.Any.fromFunction2(value))
    
    inline def onCreateOption(value: /* inputValue */ String => Callback): this.type = set("onCreateOption", js.Any.fromFunction1((t0: /* inputValue */ String) => value(t0).runNow()))
  }
  
  implicit def make(companion: AsyncCreatable.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: /* props */ (AsyncCreatableProps[Any, `false`, GroupBase[Any]]) & (RefAttributes[default[Any, `false`, GroupBase[Any]]])
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
