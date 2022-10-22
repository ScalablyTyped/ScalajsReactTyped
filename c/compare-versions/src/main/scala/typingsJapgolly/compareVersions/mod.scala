package typingsJapgolly.compareVersions

import typingsJapgolly.compareVersions.compareVersionsInts.`-1`
import typingsJapgolly.compareVersions.compareVersionsInts.`0`
import typingsJapgolly.compareVersions.compareVersionsInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("compare-versions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compare(v1: String, v2: String, operator: CompareOperator): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compare")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any], operator.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def compareVersions(v1: String, v2: String): `1` | `-1` | `0` = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[`1` | `-1` | `0`]
  
  inline def satisfies(version: String, range: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("satisfies")(version.asInstanceOf[js.Any], range.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def validate(version: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.compareVersions.compareVersionsStrings.Greaterthansign
    - typingsJapgolly.compareVersions.compareVersionsStrings.GreaterthansignEqualssign
    - typingsJapgolly.compareVersions.compareVersionsStrings.Equalssign
    - typingsJapgolly.compareVersions.compareVersionsStrings.Lessthansign
    - typingsJapgolly.compareVersions.compareVersionsStrings.LessthansignEqualssign
  */
  trait CompareOperator extends StObject
  object CompareOperator {
    
    inline def Equalssign: typingsJapgolly.compareVersions.compareVersionsStrings.Equalssign = "=".asInstanceOf[typingsJapgolly.compareVersions.compareVersionsStrings.Equalssign]
    
    inline def Greaterthansign: typingsJapgolly.compareVersions.compareVersionsStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.compareVersions.compareVersionsStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.compareVersions.compareVersionsStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.compareVersions.compareVersionsStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.compareVersions.compareVersionsStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.compareVersions.compareVersionsStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.compareVersions.compareVersionsStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.compareVersions.compareVersionsStrings.LessthansignEqualssign]
  }
}
