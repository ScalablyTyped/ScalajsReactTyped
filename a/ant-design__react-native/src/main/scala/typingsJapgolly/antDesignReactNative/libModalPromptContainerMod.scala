package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignReactNative.anon.Type
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`login-password`
import typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.`secure-text`
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.Action
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.CallbackOnBackHandler
import typingsJapgolly.antDesignReactNative.libModalPropsTypeMod.CallbackOrActions
import typingsJapgolly.antDesignReactNative.libModalStylePromptMod.PromptStyle
import typingsJapgolly.antDesignReactNative.libStyleMod.WithThemeStyles
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalPromptContainerMod {
  
  @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
  @js.native
  open class default protected () extends PropmptContainer {
    def this(props: PropmptContainerProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/react-native/lib/modal/PromptContainer", "default.defaultProps")
    @js.native
    def defaultProps: Type = js.native
    inline def defaultProps_=(x: Type): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait PropmptContainer extends Component[PropmptContainerProps, Any, Any] {
    
    def onBackAndroid(): Boolean = js.native
    
    def onChangeText(`type`: String, value: String): Unit = js.native
    
    def onClose(): Unit = js.native
  }
  
  trait PropmptContainerProps
    extends StObject
       with WithThemeStyles[PromptStyle] {
    
    var actions: CallbackOrActions[TextStyle]
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var message: js.UndefOr[Node] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var onBackHandler: js.UndefOr[CallbackOnBackHandler] = js.undefined
    
    var placeholders: js.UndefOr[js.Array[String]] = js.undefined
    
    var title: Node
    
    var `type`: js.UndefOr[
        typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
      ] = js.undefined
  }
  object PropmptContainerProps {
    
    inline def apply(actions: CallbackOrActions[TextStyle]): PropmptContainerProps = {
      val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], title = null)
      __obj.asInstanceOf[PropmptContainerProps]
    }
    
    extension [Self <: PropmptContainerProps](x: Self) {
      
      inline def setActions(value: CallbackOrActions[TextStyle]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsFunction2(value: (/* valueOrLogin */ String, /* password */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "actions", js.Any.fromFunction2((t0: /* valueOrLogin */ String, t1: /* password */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setActionsVarargs(value: Action[TextStyle]*): Self = StObject.set(x, "actions", js.Array(value*))
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setMessage(value: VdomNode): Self = StObject.set(x, "message", value.rawNode.asInstanceOf[js.Any])
      
      inline def setMessageNull: Self = StObject.set(x, "message", null)
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "message", js.Array(value*))
      
      inline def setMessageVdomElement(value: VdomElement): Self = StObject.set(x, "message", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Callback): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1((t0: /* visible */ Boolean) => value(t0).runNow()))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnBackHandler(value: CallbackTo[Boolean]): Self = StObject.set(x, "onBackHandler", value.toJsFn)
      
      inline def setOnBackHandlerUndefined: Self = StObject.set(x, "onBackHandler", js.undefined)
      
      inline def setPlaceholders(value: js.Array[String]): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      inline def setPlaceholdersVarargs(value: String*): Self = StObject.set(x, "placeholders", js.Array(value*))
      
      inline def setTitle(value: VdomNode): Self = StObject.set(x, "title", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTitleNull: Self = StObject.set(x, "title", null)
      
      inline def setTitleVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "title", js.Array(value*))
      
      inline def setTitleVdomElement(value: VdomElement): Self = StObject.set(x, "title", value.rawElement.asInstanceOf[js.Any])
      
      inline def setType(
        value: typingsJapgolly.antDesignReactNative.antDesignReactNativeStrings.default | `login-password` | `secure-text`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
