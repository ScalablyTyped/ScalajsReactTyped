package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.libModuleTypesMod.PlatformBridge
import typingsJapgolly.reactSketchapp.libModuleTypesMod.ResizeConstraints
import typingsJapgolly.reactSketchapp.libModuleTypesMod.TextNode
import typingsJapgolly.reactSketchapp.libModuleTypesMod.TextStyle
import typingsJapgolly.reactSketchapp.libModuleTypesMod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModuleJsonUtilsTextLayersMod {
  
  @JSImport("react-sketchapp/lib/module/jsonUtils/textLayers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeTextLayer(bridge: PlatformBridge): js.Function6[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ /* frame */ Any, 
    /* name */ String, 
    /* textNodes */ js.Array[TextNode], 
    /* _style */ ViewStyle, 
    /* resizingConstraint */ js.UndefOr[ResizeConstraints | Null], 
    /* shadows */ js.UndefOr[(js.Array[js.UndefOr[ViewStyle | Null]]) | Null], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Text */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTextLayer")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function6[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ /* frame */ Any, 
    /* name */ String, 
    /* textNodes */ js.Array[TextNode], 
    /* _style */ ViewStyle, 
    /* resizingConstraint */ js.UndefOr[ResizeConstraints | Null], 
    /* shadows */ js.UndefOr[(js.Array[js.UndefOr[ViewStyle | Null]]) | Null], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Text */ Any
  ]]
  
  inline def makeTextStyle(bridge: PlatformBridge): js.Function2[
    /* style */ TextStyle, 
    /* shadows */ js.UndefOr[(js.Array[js.UndefOr[ViewStyle | Null]]) | Null], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeTextStyle")(bridge.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* style */ TextStyle, 
    /* shadows */ js.UndefOr[(js.Array[js.UndefOr[ViewStyle | Null]]) | Null], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
  ]]
  
  inline def parseTextStyle(
    json: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Style */ Any
  ): TextStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTextStyle")(json.asInstanceOf[js.Any]).asInstanceOf[TextStyle]
}
