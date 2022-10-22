package typingsJapgolly.materialUiLab

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.materialUiLab.anon.PartialClassNameMapTimeliDefaultDefault
import typingsJapgolly.materialUiLab.materialUiLabStrings.default
import typingsJapgolly.materialUiLab.materialUiLabStrings.grey
import typingsJapgolly.materialUiLab.materialUiLabStrings.inherit
import typingsJapgolly.materialUiLab.materialUiLabStrings.outlined
import typingsJapgolly.materialUiLab.materialUiLabStrings.primary
import typingsJapgolly.materialUiLab.materialUiLabStrings.secondary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timelineDotTimelineDotMod {
  
  @JSImport("@material-ui/lab/TimelineDot/TimelineDot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: TimelineDotProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiLab.materialUiLabStrings.root
    - typingsJapgolly.materialUiLab.materialUiLabStrings.defaultDefault
    - typingsJapgolly.materialUiLab.materialUiLabStrings.defaultPrimary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.defaultSecondary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedDefault
    - typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedSecondary
  */
  trait TimelineDotClassKey extends StObject
  object TimelineDotClassKey {
    
    inline def defaultDefault: typingsJapgolly.materialUiLab.materialUiLabStrings.defaultDefault = "defaultDefault".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.defaultDefault]
    
    inline def defaultPrimary: typingsJapgolly.materialUiLab.materialUiLabStrings.defaultPrimary = "defaultPrimary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.defaultPrimary]
    
    inline def defaultSecondary: typingsJapgolly.materialUiLab.materialUiLabStrings.defaultSecondary = "defaultSecondary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.defaultSecondary]
    
    inline def outlinedDefault: typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedDefault = "outlinedDefault".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedDefault]
    
    inline def outlinedPrimary: typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    inline def outlinedSecondary: typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    inline def root: typingsJapgolly.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.root]
  }
  
  /* Inlined parent @material-ui/core.@material-ui/core.StandardProps<{}, @material-ui/lab.@material-ui/lab/TimelineDot/TimelineDot.TimelineDotClassKey, never> */
  trait TimelineDotProps extends StObject {
    
    /**
      * The content of the component.
      */
    var children: js.UndefOr[Node] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Override or extend the styles applied to the component.
      */
    var classes: js.UndefOr[PartialClassNameMapTimeliDefaultDefault] = js.undefined
    
    /**
      * The dot can have a different colors.
      */
    var color: js.UndefOr[inherit | primary | secondary | grey] = js.undefined
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var ref: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {} extends {  ref :infer RefType | undefined} ? RefType : react.react.Ref<unknown> */ js.Any
      ] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * The dot can appear filled or outlined.
      */
    var variant: js.UndefOr[default | outlined] = js.undefined
  }
  object TimelineDotProps {
    
    inline def apply(): TimelineDotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimelineDotProps]
    }
    
    extension [Self <: TimelineDotProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClasses(value: PartialClassNameMapTimeliDefaultDefault): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      inline def setColor(value: inherit | primary | secondary | grey): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
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
      
      inline def setVariant(value: default | outlined): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
