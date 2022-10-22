package typingsJapgolly.ampprojectRemapping

import typingsJapgolly.ampprojectRemapping.distTypesSourceMapTreeMod.MapSource
import typingsJapgolly.ampprojectRemapping.distTypesTypesMod.SourceMapLoader
import typingsJapgolly.jridgewellTraceMapping.distTypesTypesMod.SourceMapInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesBuildSourceMapTreeMod {
  
  @JSImport("@ampproject/remapping/dist/types/build-source-map-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(input: js.Array[SourceMapInput], loader: SourceMapLoader): MapSource = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[MapSource]
  inline def default(input: SourceMapInput, loader: SourceMapLoader): MapSource = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any], loader.asInstanceOf[js.Any])).asInstanceOf[MapSource]
}
