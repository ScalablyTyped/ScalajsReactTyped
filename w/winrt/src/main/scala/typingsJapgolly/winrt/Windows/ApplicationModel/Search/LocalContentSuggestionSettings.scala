package typingsJapgolly.winrt.Windows.ApplicationModel.Search

import typingsJapgolly.winrt.Windows.Foundation.Collections.IVector
import typingsJapgolly.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocalContentSuggestionSettings
  extends StObject
     with ILocalContentSuggestionSettings
object LocalContentSuggestionSettings {
  
  inline def apply(
    aqsFilter: String,
    enabled: Boolean,
    locations: IVector[StorageFolder],
    propertiesToMatch: IVector[String]
  ): LocalContentSuggestionSettings = {
    val __obj = js.Dynamic.literal(aqsFilter = aqsFilter.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], locations = locations.asInstanceOf[js.Any], propertiesToMatch = propertiesToMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalContentSuggestionSettings]
  }
}
