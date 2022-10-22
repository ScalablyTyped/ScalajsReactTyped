package typingsJapgolly.winrt.Windows.Security.Cryptography.Core

import typingsJapgolly.winrt.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyDerivationParameters
  extends StObject
     with IKeyDerivationParameters
object KeyDerivationParameters {
  
  inline def apply(iterationCount: Double, kdfGenericBinary: IBuffer): KeyDerivationParameters = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], kdfGenericBinary = kdfGenericBinary.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyDerivationParameters]
  }
}
