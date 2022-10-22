package typingsJapgolly.hashJs

import typingsJapgolly.hashJs.hashJsInts.`192`
import typingsJapgolly.hashJs.hashJsInts.`256`
import typingsJapgolly.hashJs.hashJsInts.`512`
import typingsJapgolly.hashJs.hashJsInts.`64`
import typingsJapgolly.hashJs.hashJsStrings.big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha256
  extends StObject
     with BlockHash[Sha256]
     with MessageDigest[Sha256] {
  
  @JSName("blockSize")
  var blockSize_Sha256: `512` = js.native
  
  @JSName("endian")
  var endian_Sha256: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha256: `192` = js.native
  
  @JSName("outSize")
  var outSize_Sha256: `256` = js.native
  
  @JSName("padLength")
  var padLength_Sha256: `64` = js.native
}
