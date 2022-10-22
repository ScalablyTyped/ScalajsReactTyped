package typingsJapgolly.reactNativeSvg

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNativeSvg.anon.MarkerHeight
import typingsJapgolly.reactNativeSvg.libTypescriptLibExtractTypesMod.NumberProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptElementsMarkerMod {
  
  @JSImport("react-native-svg/lib/typescript/elements/Marker", JSImport.Default)
  @js.native
  open class default () extends Marker
  /* static members */
  object default {
    
    @JSImport("react-native-svg/lib/typescript/elements/Marker", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-svg/lib/typescript/elements/Marker", "default.defaultProps")
    @js.native
    def defaultProps: MarkerHeight = js.native
    inline def defaultProps_=(x: MarkerHeight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-svg/lib/typescript/elements/Marker", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Marker
    extends typingsJapgolly.reactNativeSvg.libTypescriptElementsShapeMod.default[MarkerProps]
  
  trait MarkerProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var markerHeight: js.UndefOr[NumberProp] = js.undefined
    
    var markerUnits: js.UndefOr[MarkerUnits] = js.undefined
    
    var markerWidth: js.UndefOr[NumberProp] = js.undefined
    
    var orient: js.UndefOr[Orient | NumberProp] = js.undefined
    
    var preserveAspectRatio: js.UndefOr[String] = js.undefined
    
    var refX: js.UndefOr[NumberProp] = js.undefined
    
    var refY: js.UndefOr[NumberProp] = js.undefined
    
    var viewBox: js.UndefOr[String] = js.undefined
  }
  object MarkerProps {
    
    inline def apply(): MarkerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerProps]
    }
    
    extension [Self <: MarkerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMarkerHeight(value: NumberProp): Self = StObject.set(x, "markerHeight", value.asInstanceOf[js.Any])
      
      inline def setMarkerHeightUndefined: Self = StObject.set(x, "markerHeight", js.undefined)
      
      inline def setMarkerUnits(value: MarkerUnits): Self = StObject.set(x, "markerUnits", value.asInstanceOf[js.Any])
      
      inline def setMarkerUnitsUndefined: Self = StObject.set(x, "markerUnits", js.undefined)
      
      inline def setMarkerWidth(value: NumberProp): Self = StObject.set(x, "markerWidth", value.asInstanceOf[js.Any])
      
      inline def setMarkerWidthUndefined: Self = StObject.set(x, "markerWidth", js.undefined)
      
      inline def setOrient(value: Orient | NumberProp): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      inline def setOrientUndefined: Self = StObject.set(x, "orient", js.undefined)
      
      inline def setPreserveAspectRatio(value: String): Self = StObject.set(x, "preserveAspectRatio", value.asInstanceOf[js.Any])
      
      inline def setPreserveAspectRatioUndefined: Self = StObject.set(x, "preserveAspectRatio", js.undefined)
      
      inline def setRefX(value: NumberProp): Self = StObject.set(x, "refX", value.asInstanceOf[js.Any])
      
      inline def setRefXUndefined: Self = StObject.set(x, "refX", js.undefined)
      
      inline def setRefY(value: NumberProp): Self = StObject.set(x, "refY", value.asInstanceOf[js.Any])
      
      inline def setRefYUndefined: Self = StObject.set(x, "refY", js.undefined)
      
      inline def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      inline def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.strokeWidth
    - typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse
  */
  trait MarkerUnits extends StObject
  object MarkerUnits {
    
    inline def strokeWidth: typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.strokeWidth = "strokeWidth".asInstanceOf[typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.strokeWidth]
    
    inline def userSpaceOnUse: typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse = "userSpaceOnUse".asInstanceOf[typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.userSpaceOnUse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.auto
    - typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`auto-start-reverse`
  */
  trait Orient extends StObject
  object Orient {
    
    inline def auto: typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.auto = "auto".asInstanceOf[typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.auto]
    
    inline def `auto-start-reverse`: typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`auto-start-reverse` = "auto-start-reverse".asInstanceOf[typingsJapgolly.reactNativeSvg.reactNativeSvgStrings.`auto-start-reverse`]
  }
}
