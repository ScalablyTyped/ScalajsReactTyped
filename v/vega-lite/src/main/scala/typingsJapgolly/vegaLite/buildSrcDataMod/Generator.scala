package typingsJapgolly.vegaLite.buildSrcDataMod

import typingsJapgolly.vegaLite.vegaLiteBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vegaLite.buildSrcDataMod.SequenceGenerator
  - typingsJapgolly.vegaLite.buildSrcDataMod.SphereGenerator
  - typingsJapgolly.vegaLite.buildSrcDataMod.GraticuleGenerator
*/
trait Generator
  extends StObject
     with Data
object Generator {
  
  inline def GraticuleGenerator(graticule: `true` | GraticuleParams): typingsJapgolly.vegaLite.buildSrcDataMod.GraticuleGenerator = {
    val __obj = js.Dynamic.literal(graticule = graticule.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcDataMod.GraticuleGenerator]
  }
  
  inline def SequenceGenerator(sequence: SequenceParams): typingsJapgolly.vegaLite.buildSrcDataMod.SequenceGenerator = {
    val __obj = js.Dynamic.literal(sequence = sequence.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcDataMod.SequenceGenerator]
  }
  
  inline def SphereGenerator(sphere: `true` | js.Object): typingsJapgolly.vegaLite.buildSrcDataMod.SphereGenerator = {
    val __obj = js.Dynamic.literal(sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vegaLite.buildSrcDataMod.SphereGenerator]
  }
}
