package typingsJapgolly.webcryptoCore.mod

import org.scalajs.dom.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CryptoKeyStorage
  extends StObject
     with CryptoStorage[org.scalajs.dom.CryptoKey] {
  
  def getItem(index: String, algorithm: ImportAlgorithms, extractable: Boolean, keyUsages: js.Array[KeyUsage]): js.Promise[org.scalajs.dom.CryptoKey] = js.native
}
