package typingsJapgolly.reactNativeTags

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-tags", JSImport.Default)
  @js.native
  open class default ()
    extends Component[TagsProps, js.Object, Any]
  
  trait RenderTag extends StObject {
    
    def deleteTagOnPress(): Unit
    
    var index: Double
    
    def onPress(): Unit
    
    var readonly: Boolean
    
    var tag: String
  }
  object RenderTag {
    
    inline def apply(deleteTagOnPress: Callback, index: Double, onPress: Callback, readonly: Boolean, tag: String): RenderTag = {
      val __obj = js.Dynamic.literal(deleteTagOnPress = deleteTagOnPress.toJsFn, index = index.asInstanceOf[js.Any], onPress = onPress.toJsFn, readonly = readonly.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenderTag]
    }
    
    extension [Self <: RenderTag](x: Self) {
      
      inline def setDeleteTagOnPress(value: Callback): Self = StObject.set(x, "deleteTagOnPress", value.toJsFn)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setOnPress(value: Callback): Self = StObject.set(x, "onPress", value.toJsFn)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait TagPress extends StObject {
    
    var deleted: Boolean
    
    def event(): Unit
    
    var index: Double
    
    var tagLabel: String
  }
  object TagPress {
    
    inline def apply(deleted: Boolean, event: Callback, index: Double, tagLabel: String): TagPress = {
      val __obj = js.Dynamic.literal(deleted = deleted.asInstanceOf[js.Any], event = event.toJsFn, index = index.asInstanceOf[js.Any], tagLabel = tagLabel.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagPress]
    }
    
    extension [Self <: TagPress](x: Self) {
      
      inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: Callback): Self = StObject.set(x, "event", value.toJsFn)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setTagLabel(value: String): Self = StObject.set(x, "tagLabel", value.asInstanceOf[js.Any])
    }
  }
  
  type Tags = japgolly.scalajs.react.facade.React.Component[TagsProps & js.Object, js.Object]
  
  trait TagsProps extends StObject {
    
    var containerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var createTagOnReturn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Triggers new tag creation
      */
    var createTagOnString: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Remove the tag when pressed
      */
    var deleteTagOnPress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Initial tags
      * ```javascript
      * initialTags={["dog", "cat", "chicken"]}
      * ```
      */
    var initialTags: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The input element's text
      */
    var initialText: js.UndefOr[String] = js.undefined
    
    var inputContainerStyle: js.UndefOr[TextStyle] = js.undefined
    
    var inputStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * The max number of tags that can be entered
      */
    var maxNumberOfTags: js.UndefOr[Double] = js.undefined
    
    /**
      * Fires when tags are added or removed
      * ```javascript
      * onChangeTags={(tags) => console.warn(tags)}
      * ```
      */
    var onChangeTags: js.UndefOr[js.Function1[/* tags */ js.Array[String], Unit]] = js.undefined
    
    /**
      * Fires when tags are pressed
      */
    var onTagPress: js.UndefOr[
        js.Function4[/* index */ Double, /* tagLabel */ String, /* event */ Any, /* deleted */ Boolean, Unit]
      ] = js.undefined
    
    /**
      * Tags cannot be modified
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Manage the rendering of your own Tag
      * * tag - text of the tag
      * * index - position in the array of tags
      * * onPress - Removes the tag if deleteTagsOnPress and readonly is false
      * ```javascript
      * renderTag={({ tag, index, onPress }) => (
      *   <TouchableOpacity key={`${tag}-${index}`} onPress={onPress}>
      *     <Text>{tag}</Text>
      *   </TouchableOpacity>
      * )}
      * ```
      */
    def renderTag(tag: RenderTag): Unit
    
    var style: js.UndefOr[ViewStyle] = js.undefined
    
    var tagContainerStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var tagTextStyle: js.UndefOr[TextStyle] = js.undefined
    
    /**
      * Forward props to the textInput
      * ```javascript
      * textInputProps={{
      *   placeholder: "Any type of animal"
      * }}
      * ```
      */
    var textInputProps: js.UndefOr[TextInputProps] = js.undefined
  }
  object TagsProps {
    
    inline def apply(renderTag: RenderTag => Callback): TagsProps = {
      val __obj = js.Dynamic.literal(renderTag = js.Any.fromFunction1((t0: RenderTag) => renderTag(t0).runNow()))
      __obj.asInstanceOf[TagsProps]
    }
    
    extension [Self <: TagsProps](x: Self) {
      
      inline def setContainerStyle(value: ViewStyle): Self = StObject.set(x, "containerStyle", value.asInstanceOf[js.Any])
      
      inline def setContainerStyleUndefined: Self = StObject.set(x, "containerStyle", js.undefined)
      
      inline def setCreateTagOnReturn(value: Boolean): Self = StObject.set(x, "createTagOnReturn", value.asInstanceOf[js.Any])
      
      inline def setCreateTagOnReturnUndefined: Self = StObject.set(x, "createTagOnReturn", js.undefined)
      
      inline def setCreateTagOnString(value: js.Array[String]): Self = StObject.set(x, "createTagOnString", value.asInstanceOf[js.Any])
      
      inline def setCreateTagOnStringUndefined: Self = StObject.set(x, "createTagOnString", js.undefined)
      
      inline def setCreateTagOnStringVarargs(value: String*): Self = StObject.set(x, "createTagOnString", js.Array(value*))
      
      inline def setDeleteTagOnPress(value: Boolean): Self = StObject.set(x, "deleteTagOnPress", value.asInstanceOf[js.Any])
      
      inline def setDeleteTagOnPressUndefined: Self = StObject.set(x, "deleteTagOnPress", js.undefined)
      
      inline def setInitialTags(value: js.Array[String]): Self = StObject.set(x, "initialTags", value.asInstanceOf[js.Any])
      
      inline def setInitialTagsUndefined: Self = StObject.set(x, "initialTags", js.undefined)
      
      inline def setInitialTagsVarargs(value: String*): Self = StObject.set(x, "initialTags", js.Array(value*))
      
      inline def setInitialText(value: String): Self = StObject.set(x, "initialText", value.asInstanceOf[js.Any])
      
      inline def setInitialTextUndefined: Self = StObject.set(x, "initialText", js.undefined)
      
      inline def setInputContainerStyle(value: TextStyle): Self = StObject.set(x, "inputContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setInputContainerStyleUndefined: Self = StObject.set(x, "inputContainerStyle", js.undefined)
      
      inline def setInputStyle(value: TextStyle): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
      
      inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
      
      inline def setMaxNumberOfTags(value: Double): Self = StObject.set(x, "maxNumberOfTags", value.asInstanceOf[js.Any])
      
      inline def setMaxNumberOfTagsUndefined: Self = StObject.set(x, "maxNumberOfTags", js.undefined)
      
      inline def setOnChangeTags(value: /* tags */ js.Array[String] => Callback): Self = StObject.set(x, "onChangeTags", js.Any.fromFunction1((t0: /* tags */ js.Array[String]) => value(t0).runNow()))
      
      inline def setOnChangeTagsUndefined: Self = StObject.set(x, "onChangeTags", js.undefined)
      
      inline def setOnTagPress(
        value: (/* index */ Double, /* tagLabel */ String, /* event */ Any, /* deleted */ Boolean) => Callback
      ): Self = StObject.set(x, "onTagPress", js.Any.fromFunction4((t0: /* index */ Double, t1: /* tagLabel */ String, t2: /* event */ Any, t3: /* deleted */ Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnTagPressUndefined: Self = StObject.set(x, "onTagPress", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setRenderTag(value: RenderTag => Callback): Self = StObject.set(x, "renderTag", js.Any.fromFunction1((t0: RenderTag) => value(t0).runNow()))
      
      inline def setStyle(value: ViewStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTagContainerStyle(value: ViewStyle): Self = StObject.set(x, "tagContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setTagContainerStyleUndefined: Self = StObject.set(x, "tagContainerStyle", js.undefined)
      
      inline def setTagTextStyle(value: TextStyle): Self = StObject.set(x, "tagTextStyle", value.asInstanceOf[js.Any])
      
      inline def setTagTextStyleUndefined: Self = StObject.set(x, "tagTextStyle", js.undefined)
      
      inline def setTextInputProps(value: TextInputProps): Self = StObject.set(x, "textInputProps", value.asInstanceOf[js.Any])
      
      inline def setTextInputPropsUndefined: Self = StObject.set(x, "textInputProps", js.undefined)
    }
  }
  
  trait TextInputProps extends StObject {
    
    var placeholder: String
  }
  object TextInputProps {
    
    inline def apply(placeholder: String): TextInputProps = {
      val __obj = js.Dynamic.literal(placeholder = placeholder.asInstanceOf[js.Any])
      __obj.asInstanceOf[TextInputProps]
    }
    
    extension [Self <: TextInputProps](x: Self) {
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    }
  }
}
