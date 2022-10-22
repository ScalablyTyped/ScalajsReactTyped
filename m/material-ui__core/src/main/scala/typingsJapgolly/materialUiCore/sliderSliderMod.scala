package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLSpanElement
import typingsJapgolly.materialUiCore.anon.Arialabel
import typingsJapgolly.materialUiCore.materialUiCoreStrings.span
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sliderSliderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Slider](https://mui.com/components/slider/)
    *
    * API:
    *
    * - [Slider API](https://mui.com/api/slider/)
    */
  @JSImport("@material-ui/core/Slider/Slider", JSImport.Default)
  @js.native
  val default: OverridableComponent[SliderTypeMap[js.Object, span]] = js.native
  
  trait Mark extends StObject {
    
    var label: js.UndefOr[Node] = js.undefined
    
    var value: Double
  }
  object Mark {
    
    inline def apply(value: Double): Mark = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mark]
    }
    
    extension [Self <: Mark](x: Self) {
      
      inline def setLabel(value: VdomNode): Self = StObject.set(x, "label", value.rawNode.asInstanceOf[js.Any])
      
      inline def setLabelNull: Self = StObject.set(x, "label", null)
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "label", js.Array(value*))
      
      inline def setLabelVdomElement(value: VdomElement): Self = StObject.set(x, "label", value.rawElement.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.marked
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.rail
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.track
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.trackFalse
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.trackInverted
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.thumb
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.thumbColorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.thumbColorSecondary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.active
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.valueLabel
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.mark
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.markActive
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.markLabel
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.markLabelActive
  */
  trait SliderClassKey extends StObject
  object SliderClassKey {
    
    inline def active: typingsJapgolly.materialUiCore.materialUiCoreStrings.active = "active".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.active]
    
    inline def colorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def colorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary = "colorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorSecondary]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def mark: typingsJapgolly.materialUiCore.materialUiCoreStrings.mark = "mark".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.mark]
    
    inline def markActive: typingsJapgolly.materialUiCore.materialUiCoreStrings.markActive = "markActive".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.markActive]
    
    inline def markLabel: typingsJapgolly.materialUiCore.materialUiCoreStrings.markLabel = "markLabel".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.markLabel]
    
    inline def markLabelActive: typingsJapgolly.materialUiCore.materialUiCoreStrings.markLabelActive = "markLabelActive".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.markLabelActive]
    
    inline def marked: typingsJapgolly.materialUiCore.materialUiCoreStrings.marked = "marked".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.marked]
    
    inline def rail: typingsJapgolly.materialUiCore.materialUiCoreStrings.rail = "rail".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.rail]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def thumb: typingsJapgolly.materialUiCore.materialUiCoreStrings.thumb = "thumb".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.thumb]
    
    inline def thumbColorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.thumbColorPrimary = "thumbColorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.thumbColorPrimary]
    
    inline def thumbColorSecondary: typingsJapgolly.materialUiCore.materialUiCoreStrings.thumbColorSecondary = "thumbColorSecondary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.thumbColorSecondary]
    
    inline def track: typingsJapgolly.materialUiCore.materialUiCoreStrings.track = "track".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.track]
    
    inline def trackFalse: typingsJapgolly.materialUiCore.materialUiCoreStrings.trackFalse = "trackFalse".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.trackFalse]
    
    inline def trackInverted: typingsJapgolly.materialUiCore.materialUiCoreStrings.trackInverted = "trackInverted".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.trackInverted]
    
    inline def valueLabel: typingsJapgolly.materialUiCore.materialUiCoreStrings.valueLabel = "valueLabel".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.valueLabel]
    
    inline def vertical: typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical]
  }
  
  type SliderProps[D /* <: ElementType */, P] = OverrideProps[SliderTypeMap[P, D], D]
  
  trait SliderTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: SliderClassKey
    
    var defaultComponent: D
    
    var props: P & Arialabel
  }
  object SliderTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: SliderClassKey, defaultComponent: D, props: P & Arialabel): SliderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SliderTypeMap[P, D]]
    }
    
    extension [Self <: SliderTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (SliderTypeMap[P, D])) {
      
      inline def setClassKey(value: SliderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Arialabel): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait ValueLabelProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    @JSName("children")
    var children_ValueLabelProps: Element
    
    var open: Boolean
    
    var value: Double
  }
  object ValueLabelProps {
    
    inline def apply(children: VdomElement, open: Boolean, value: Double): ValueLabelProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueLabelProps]
    }
    
    extension [Self <: ValueLabelProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SliderTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `sliderSliderMod.foo` */
  override def _to: OverridableComponent[SliderTypeMap[js.Object, span]] = default
}
