package typingsJapgolly.hashJs

import typingsJapgolly.hashJs.hashJsInts.`160`
import typingsJapgolly.hashJs.hashJsInts.`512`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Hmac
  extends StObject
     with MessageDigest[Hmac] {
  
  @JSName("blockSize")
  var blockSize_Hmac: `512` = js.native
  
  @JSName("outSize")
  var outSize_Hmac: `160` = js.native
}
