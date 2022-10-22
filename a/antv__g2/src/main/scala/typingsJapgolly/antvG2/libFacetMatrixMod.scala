package typingsJapgolly.antvG2

import typingsJapgolly.antvG2.libFacetFacetMod.Facet
import typingsJapgolly.antvG2.libInterfaceMod.MatrixCfg
import typingsJapgolly.antvG2.libInterfaceMod.MatrixData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFacetMatrixMod {
  
  @JSImport("@antv/g2/lib/facet/matrix", JSImport.Default)
  @js.native
  open class default () extends Matrix
  
  @js.native
  trait Matrix extends Facet[MatrixCfg, MatrixData] {
    
    /**
      * facet title
      */
    /* private */ var renderTitle: Any = js.native
  }
}
