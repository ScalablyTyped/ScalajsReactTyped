package typingsJapgolly.reactNativeTags.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTags.mod.RenderTag
import typingsJapgolly.reactNativeTags.mod.TagsProps
import typingsJapgolly.reactNativeTags.mod.TextInputProps
import typingsJapgolly.reactNativeTags.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactNativeTags {
  
  inline def apply(renderTag: RenderTag => Callback): Builder = {
    val __props = js.Dynamic.literal(renderTag = js.Any.fromFunction1((t0: RenderTag) => renderTag(t0).runNow()))
    new Builder(js.Array(this.component, __props.asInstanceOf[TagsProps]))
  }
  
  @JSImport("react-native-tags", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def containerStyle(value: ViewStyle): this.type = set("containerStyle", value.asInstanceOf[js.Any])
    
    inline def createTagOnReturn(value: Boolean): this.type = set("createTagOnReturn", value.asInstanceOf[js.Any])
    
    inline def createTagOnString(value: js.Array[String]): this.type = set("createTagOnString", value.asInstanceOf[js.Any])
    
    inline def createTagOnStringVarargs(value: String*): this.type = set("createTagOnString", js.Array(value*))
    
    inline def deleteTagOnPress(value: Boolean): this.type = set("deleteTagOnPress", value.asInstanceOf[js.Any])
    
    inline def initialTags(value: js.Array[String]): this.type = set("initialTags", value.asInstanceOf[js.Any])
    
    inline def initialTagsVarargs(value: String*): this.type = set("initialTags", js.Array(value*))
    
    inline def initialText(value: String): this.type = set("initialText", value.asInstanceOf[js.Any])
    
    inline def inputContainerStyle(value: TextStyle): this.type = set("inputContainerStyle", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: TextStyle): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def maxNumberOfTags(value: Double): this.type = set("maxNumberOfTags", value.asInstanceOf[js.Any])
    
    inline def onChangeTags(value: /* tags */ js.Array[String] => Callback): this.type = set("onChangeTags", js.Any.fromFunction1((t0: /* tags */ js.Array[String]) => value(t0).runNow()))
    
    inline def onTagPress(
      value: (/* index */ Double, /* tagLabel */ String, /* event */ Any, /* deleted */ Boolean) => Callback
    ): this.type = set("onTagPress", js.Any.fromFunction4((t0: /* index */ Double, t1: /* tagLabel */ String, t2: /* event */ Any, t3: /* deleted */ Boolean) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def readonly(value: Boolean): this.type = set("readonly", value.asInstanceOf[js.Any])
    
    inline def style(value: ViewStyle): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tagContainerStyle(value: ViewStyle): this.type = set("tagContainerStyle", value.asInstanceOf[js.Any])
    
    inline def tagTextStyle(value: TextStyle): this.type = set("tagTextStyle", value.asInstanceOf[js.Any])
    
    inline def textInputProps(value: TextInputProps): this.type = set("textInputProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TagsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
