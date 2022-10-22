package typingsJapgolly.std.global

import org.scalajs.dom.KeyAlgorithm
import org.scalajs.dom.KeyType
import org.scalajs.dom.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("CryptoKey")
@js.native
/* standard dom */
open class CryptoKey ()
  extends StObject
     with typingsJapgolly.std.CryptoKey {
  
  /* standard dom */
  /* CompleteClass */
  override val algorithm: KeyAlgorithm = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val extractable: scala.Boolean = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val `type`: KeyType = js.native
  
  /* standard dom */
  /* CompleteClass */
  override val usages: js.Array[KeyUsage] = js.native
}
