package typingsJapgolly.materialUiLab

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiLab.anon.PartialClassNameMapTimeli
import typingsJapgolly.materialUiLab.materialUiLabStrings.alternate
import typingsJapgolly.materialUiLab.materialUiLabStrings.left
import typingsJapgolly.materialUiLab.materialUiLabStrings.right
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineTimelineMod {
  
  @JSImport("@material-ui/lab/Timeline/Timeline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TimelineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiLab.materialUiLabStrings.root
    - typingsJapgolly.materialUiLab.materialUiLabStrings.alignLeft
    - typingsJapgolly.materialUiLab.materialUiLabStrings.alignRight
    - typingsJapgolly.materialUiLab.materialUiLabStrings.alignAlternate
  */
  trait TimelineClassKey extends StObject
  object TimelineClassKey {
    
    inline def alignAlternate: typingsJapgolly.materialUiLab.materialUiLabStrings.alignAlternate = "alignAlternate".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.alignAlternate]
    
    inline def alignLeft: typingsJapgolly.materialUiLab.materialUiLabStrings.alignLeft = "alignLeft".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.alignLeft]
    
    inline def alignRight: typingsJapgolly.materialUiLab.materialUiLabStrings.alignRight = "alignRight".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.alignRight]
    
    inline def root: typingsJapgolly.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/Timeline/Timeline.TimelineClassKey, never> */
  trait TimelineProps extends StObject {
    
    /**
      * The position where the timeline's content should appear.
      */
    var align: js.UndefOr[left | right | alternate] = js.undefined
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapTimeli] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object TimelineProps {
    
    inline def apply(): TimelineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineProps]
    }
    
    extension [Self <: TimelineProps](x: Self) {
      
      inline def setAlign(value: left | right | alternate): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapTimeli): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setRef(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
