package typingsJapgolly.antd

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libUtilStatusUtilsMod.InputStatus
import typingsJapgolly.rcMentions.esMentionsMod.MentionsProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMentionsMod extends Shortcut {
  
  @JSImport("antd/lib/mentions", JSImport.Default)
  @js.native
  val default: CompoundedComponent = js.native
  
  @JSImport("antd/lib/mentions", "Option")
  @js.native
  val Option: FC[typingsJapgolly.rcSelect.libOptionMod.OptionProps] = js.native
  
  @js.native
  trait CompoundedComponent
    extends StObject
       with ForwardRefExoticComponent[MentionProps & RefAttributes[HTMLElement]] {
    
    var Option: FC[typingsJapgolly.rcSelect.libOptionMod.OptionProps] = js.native
    
    def getMentions(value: String): js.Array[MentionsEntity] = js.native
    def getMentions(value: String, config: MentionsConfig): js.Array[MentionsEntity] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antd.antdStrings.top
    - typingsJapgolly.antd.antdStrings.bottom
  */
  trait MentionPlacement extends StObject
  object MentionPlacement {
    
    inline def bottom: typingsJapgolly.antd.antdStrings.bottom = "bottom".asInstanceOf[typingsJapgolly.antd.antdStrings.bottom]
    
    inline def top: typingsJapgolly.antd.antdStrings.top = "top".asInstanceOf[typingsJapgolly.antd.antdStrings.top]
  }
  
  trait MentionProps
    extends StObject
       with MentionsProps {
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
  }
  object MentionProps {
    
    inline def apply(): MentionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MentionProps]
    }
    
    extension [Self <: MentionProps](x: Self) {
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait MentionState extends StObject {
    
    var focused: Boolean
  }
  object MentionState {
    
    inline def apply(focused: Boolean): MentionState = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionState]
    }
    
    extension [Self <: MentionState](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    }
  }
  
  trait MentionsConfig extends StObject {
    
    var prefix: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var split: js.UndefOr[String] = js.undefined
  }
  object MentionsConfig {
    
    inline def apply(): MentionsConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MentionsConfig]
    }
    
    extension [Self <: MentionsConfig](x: Self) {
      
      inline def setPrefix(value: String | js.Array[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPrefixVarargs(value: String*): Self = StObject.set(x, "prefix", js.Array(value*))
      
      inline def setSplit(value: String): Self = StObject.set(x, "split", value.asInstanceOf[js.Any])
      
      inline def setSplitUndefined: Self = StObject.set(x, "split", js.undefined)
    }
  }
  
  trait MentionsEntity extends StObject {
    
    var prefix: String
    
    var value: String
  }
  object MentionsEntity {
    
    inline def apply(prefix: String, value: String): MentionsEntity = {
      val __obj = js.Dynamic.literal(prefix = prefix.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[MentionsEntity]
    }
    
    extension [Self <: MentionsEntity](x: Self) {
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionProps
    extends StObject
       with /* customProp */ StringDictionary[Any] {
    
    var children: Node
    
    var value: String
  }
  object OptionProps {
    
    inline def apply(value: String): OptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any], children = null)
      __obj.asInstanceOf[OptionProps]
    }
    
    extension [Self <: OptionProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = CompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libMentionsMod.foo` */
  override def _to: CompoundedComponent = default
}
