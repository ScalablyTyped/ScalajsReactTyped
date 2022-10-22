package typingsJapgolly.winrt.global.Windows.ApplicationModel

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import typingsJapgolly.winrt.Windows.Foundation.Uri
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.ApplicationModel.Package")
@js.native
open class Package ()
  extends StObject
     with typingsJapgolly.winrt.Windows.ApplicationModel.Package {
  
  /* CompleteClass */
  var dependencies: IVectorView[typingsJapgolly.winrt.Windows.ApplicationModel.Package] = js.native
  
  /* CompleteClass */
  var description: String = js.native
  
  /* CompleteClass */
  var displayName: String = js.native
  
  /* CompleteClass */
  var id: typingsJapgolly.winrt.Windows.ApplicationModel.PackageId = js.native
  
  /* CompleteClass */
  var installedLocation: StorageFolder = js.native
  
  /* CompleteClass */
  var isBundle: Boolean = js.native
  
  /* CompleteClass */
  var isDevelopmentMode: Boolean = js.native
  
  /* CompleteClass */
  var isFramework: Boolean = js.native
  
  /* CompleteClass */
  var isResourcePackage: Boolean = js.native
  
  /* CompleteClass */
  var logo: Uri = js.native
  
  /* CompleteClass */
  var publisherDisplayName: String = js.native
}
/* static members */
object Package {
  
  @JSGlobal("Windows.ApplicationModel.Package")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Windows.ApplicationModel.Package.current")
  @js.native
  def current: typingsJapgolly.winrt.Windows.ApplicationModel.Package = js.native
  inline def current_=(x: typingsJapgolly.winrt.Windows.ApplicationModel.Package): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("current")(x.asInstanceOf[js.Any])
}
