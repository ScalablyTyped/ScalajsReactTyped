package typingsJapgolly.winrt.Windows.Media.Protection

import typingsJapgolly.winrt.Windows.Foundation.Collections.IPropertySet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaProtectionManager
  extends StObject
     with IMediaProtectionManager
object MediaProtectionManager {
  
  inline def apply(oncomponentloadfailed: Any, onrebootneeded: Any, onservicerequested: Any, properties: IPropertySet): MediaProtectionManager = {
    val __obj = js.Dynamic.literal(oncomponentloadfailed = oncomponentloadfailed.asInstanceOf[js.Any], onrebootneeded = onrebootneeded.asInstanceOf[js.Any], onservicerequested = onservicerequested.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaProtectionManager]
  }
}
