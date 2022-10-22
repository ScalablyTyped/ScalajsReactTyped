package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.blueprintjsCore.blueprintjsCoreBooleans.`false`
import typingsJapgolly.blueprintjsCore.libEsmCommonIntentMod.Intent
import typingsJapgolly.blueprintjsIcons.libEsmGenerated16pxBlueprintIcons16Mod.BlueprintIcons16Id
import typingsJapgolly.react.mod.FormEventHandler
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonPropsMod {
  
  @JSImport("@blueprintjs/core/lib/esm/common/props", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/common/props", "DISPLAYNAME_PREFIX")
  @js.native
  val DISPLAYNAME_PREFIX: /* "Blueprint4" */ String = js.native
  
  inline def removeNonHTMLProps(props: StringDictionary[Any]): StringDictionary[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any]).asInstanceOf[StringDictionary[Any]]
  inline def removeNonHTMLProps(props: StringDictionary[Any], invalidProps: js.Array[String]): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any], invalidProps.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def removeNonHTMLProps(props: StringDictionary[Any], invalidProps: js.Array[String], shouldMerge: Boolean): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any], invalidProps.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  inline def removeNonHTMLProps(props: StringDictionary[Any], invalidProps: Unit, shouldMerge: Boolean): StringDictionary[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeNonHTMLProps")(props.asInstanceOf[js.Any], invalidProps.asInstanceOf[js.Any], shouldMerge.asInstanceOf[js.Any])).asInstanceOf[StringDictionary[Any]]
  
  type ActionProps = IActionProps
  
  type ControlledProps2 = IControlledProps2
  
  type HTMLDivProps = HTMLAttributes[HTMLDivElement]
  
  type HTMLInputProps = InputHTMLAttributes[HTMLInputElement]
  
  trait IActionProps
    extends StObject
       with IIntentProps
       with IProps {
    
    /** Whether this action is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Name of a Blueprint UI icon (or an icon element) to render before the text. */
    var icon: js.UndefOr[BlueprintIcons16Id | MaybeElement] = js.undefined
    
    /** Click event handler. */
    var onClick: js.UndefOr[js.Function1[/* event */ ReactMouseEventFrom[HTMLElement], Unit]] = js.undefined
    
    /** Action text. Can be any single React renderable. */
    var text: js.UndefOr[Node] = js.undefined
  }
  object IActionProps {
    
    inline def apply(): IActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IActionProps]
    }
    
    extension [Self <: IActionProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setIcon(value: BlueprintIcons16Id | MaybeElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconNull: Self = StObject.set(x, "icon", null)
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIconVdomElement(value: VdomElement): Self = StObject.set(x, "icon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* event */ ReactMouseEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setText(value: VdomNode): Self = StObject.set(x, "text", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTextNull: Self = StObject.set(x, "text", null)
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTextVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "text", js.Array(value*))
      
      inline def setTextVdomElement(value: VdomElement): Self = StObject.set(x, "text", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait IControlledProps extends StObject {
    
    /** Initial value of the input, for uncontrolled usage. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** Change event handler. Use `event.target.value` for new value. */
    var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
    
    /** Form value of the input, for controlled usage. */
    var value: js.UndefOr[String] = js.undefined
  }
  object IControlledProps {
    
    inline def apply(): IControlledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledProps]
    }
    
    extension [Self <: IControlledProps](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLElement & org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLElement & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IControlledProps2 extends StObject {
    
    /** Initial value of the input, for uncontrolled usage. */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /** Form value of the input, for controlled usage. */
    var value: js.UndefOr[String] = js.undefined
  }
  object IControlledProps2 {
    
    inline def apply(): IControlledProps2 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IControlledProps2]
    }
    
    extension [Self <: IControlledProps2](x: Self) {
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait IElementRefProps[E /* <: HTMLElement */] extends StObject {
    
    /** A ref handler or a ref object that receives the native HTML element rendered by this component. */
    var elementRef: js.UndefOr[Ref[E]] = js.undefined
  }
  object IElementRefProps {
    
    inline def apply[E /* <: HTMLElement */](): IElementRefProps[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IElementRefProps[E]]
    }
    
    extension [Self <: IElementRefProps[?], E /* <: HTMLElement */](x: Self & IElementRefProps[E]) {
      
      inline def setElementRef(value: Ref[E]): Self = StObject.set(x, "elementRef", value.asInstanceOf[js.Any])
      
      inline def setElementRefFunction1(value: E | Null => Callback): Self = StObject.set(x, "elementRef", js.Any.fromFunction1((t0: E | Null) => value(t0).runNow()))
      
      inline def setElementRefNull: Self = StObject.set(x, "elementRef", null)
      
      inline def setElementRefUndefined: Self = StObject.set(x, "elementRef", js.undefined)
    }
  }
  
  trait IIntentProps extends StObject {
    
    /** Visual intent color to apply to element. */
    var intent: js.UndefOr[Intent] = js.undefined
  }
  object IIntentProps {
    
    inline def apply(): IIntentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IIntentProps]
    }
    
    extension [Self <: IIntentProps](x: Self) {
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    }
  }
  
  trait ILinkProps extends StObject {
    
    /** Link URL. */
    var href: js.UndefOr[String] = js.undefined
    
    /** Link target attribute. Use `"_blank"` to open in a new window. */
    var target: js.UndefOr[String] = js.undefined
  }
  object ILinkProps {
    
    inline def apply(): ILinkProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILinkProps]
    }
    
    extension [Self <: ILinkProps](x: Self) {
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait IOptionProps
    extends StObject
       with IProps {
    
    /** Whether this option is non-interactive. */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Label text for this option. If omitted, `value` is used as the label. */
    var label: js.UndefOr[String] = js.undefined
    
    /** Value of this option. */
    var value: String | Double
  }
  object IOptionProps {
    
    inline def apply(value: String | Double): IOptionProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionProps]
    }
    
    extension [Self <: IOptionProps](x: Self) {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait IProps extends StObject {
    
    /** A space-delimited list of class names to pass along to a child element. */
    var className: js.UndefOr[String] = js.undefined
  }
  object IProps {
    
    inline def apply(): IProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IProps]
    }
    
    extension [Self <: IProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
  
  type IntentProps = IIntentProps
  
  type LinkProps = ILinkProps
  
  type MaybeElement = js.UndefOr[typingsJapgolly.react.mod.global.JSX.Element | `false` | Null]
  
  type OptionProps = IOptionProps
  
  type Props = IProps
}
