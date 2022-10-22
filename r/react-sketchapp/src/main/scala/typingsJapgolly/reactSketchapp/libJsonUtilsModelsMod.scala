package typingsJapgolly.reactSketchapp

import typingsJapgolly.reactSketchapp.anon.Sha1
import typingsJapgolly.reactSketchapp.libTypesMod.ResizeConstraints
import typingsJapgolly.reactSketchapp.reactSketchappStrings.flowDestination
import typingsJapgolly.reactSketchapp.reactSketchappStrings.image
import typingsJapgolly.reactSketchapp.reactSketchappStrings.layerStyle
import typingsJapgolly.reactSketchapp.reactSketchappStrings.stringValue
import typingsJapgolly.reactSketchapp.reactSketchappStrings.symbolID
import typingsJapgolly.reactSketchapp.reactSketchappStrings.textStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libJsonUtilsModelsMod {
  
  @JSImport("react-sketchapp/lib/jsonUtils/models", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-sketchapp/lib/jsonUtils/models", "emptyGradient")
  @js.native
  val emptyGradient: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Gradient */ Any = js.native
  
  inline def generateID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateID")().asInstanceOf[String]
  inline def generateID(seed: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("generateID")(seed.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def generateID(seed: String, hardcoded: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateID")(seed.asInstanceOf[js.Any], hardcoded.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def generateID(seed: Unit, hardcoded: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("generateID")(seed.asInstanceOf[js.Any], hardcoded.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def makeColorFill(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFill")().asInstanceOf[Any]
  inline def makeColorFill(cssColor: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFill")(cssColor.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeColorFill(cssColor: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFill")(cssColor.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def makeColorFromCSS(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")().asInstanceOf[Any]
  inline def makeColorFromCSS(input: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeColorFromCSS(input: String, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")(input.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeColorFromCSS(input: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeColorFromCSS(input: Double, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")(input.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeColorFromCSS(input: Null, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")(input.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeColorFromCSS(input: Unit, alpha: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeColorFromCSS")(input.asInstanceOf[js.Any], alpha.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeImageFill(
    image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ImageDataRef */ Any
  ): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeImageFill")(image.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def makeImageFill(
    image: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ImageDataRef */ Any,
    patternFillType: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.PatternFillType */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeImageFill")(image.asInstanceOf[js.Any], patternFillType.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeJSONDataReference(image: Sha1): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeJSONDataReference")(image.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def makeOverride(
    path: String,
    `type`: image | textStyle | symbolID | stringValue | layerStyle | flowDestination,
    value: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOverride")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeOverride(
    path: String,
    `type`: image | textStyle | symbolID | stringValue | layerStyle | flowDestination,
    value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.ImageDataRef */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeOverride")(path.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeRect(x: Double, y: Double, width: Double, height: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeRect")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeSymbolInstance(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    symbolID: String,
    name: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolInstance")(frame.asInstanceOf[js.Any], symbolID.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def makeSymbolInstance(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    symbolID: String,
    name: String,
    resizingConstraint: ResizeConstraints
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolInstance")(frame.asInstanceOf[js.Any], symbolID.asInstanceOf[js.Any], name.asInstanceOf[js.Any], resizingConstraint.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def makeSymbolMaster(
    frame: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FileFormat.Rect */ Any,
    symbolID: String,
    name: String
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeSymbolMaster")(frame.asInstanceOf[js.Any], symbolID.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Any]
}
