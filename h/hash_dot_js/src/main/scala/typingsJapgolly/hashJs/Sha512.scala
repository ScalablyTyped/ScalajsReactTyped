package typingsJapgolly.hashJs

import typingsJapgolly.hashJs.hashJsInts.`1024`
import typingsJapgolly.hashJs.hashJsInts.`128`
import typingsJapgolly.hashJs.hashJsInts.`192`
import typingsJapgolly.hashJs.hashJsInts.`512`
import typingsJapgolly.hashJs.hashJsStrings.big
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sha512
  extends StObject
     with BlockHash[Sha512]
     with MessageDigest[Sha512] {
  
  @JSName("blockSize")
  var blockSize_Sha512: `1024` = js.native
  
  @JSName("endian")
  var endian_Sha512: big = js.native
  
  @JSName("hmacStrength")
  var hmacStrength_Sha512: `192` = js.native
  
  @JSName("outSize")
  var outSize_Sha512: `512` = js.native
  
  @JSName("padLength")
  var padLength_Sha512: `128` = js.native
}
