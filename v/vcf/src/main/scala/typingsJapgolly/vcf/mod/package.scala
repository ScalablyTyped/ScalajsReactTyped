package typingsJapgolly.vcf

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /** jCard standard format */
  type jCard = js.Tuple2[
    typingsJapgolly.vcf.vcfStrings.vcard, 
    js.Array[typingsJapgolly.vcf.mod.jCardProperty]
  ]
  type jCardProperty = js.Tuple4[
    java.lang.String, 
    org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]], 
    java.lang.String, 
    java.lang.String | js.Array[java.lang.String]
  ]
}
