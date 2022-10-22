package typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Search for developer metadata in a spreadsheet. To create new developer metadata finder use
  * Range.createDeveloperMetadataFinder(), Sheet.createDeveloperMetadataFinder(),
  * or Spreadsheet.createDeveloperMetadataFinder().
  */
trait DeveloperMetadataFinder extends StObject {
  
  def find(): js.Array[DeveloperMetadata]
  
  def onIntersectingLocations(): DeveloperMetadataFinder
  
  def withId(id: Integer): DeveloperMetadataFinder
  
  def withKey(key: String): DeveloperMetadataFinder
  
  def withLocationType(locationType: DeveloperMetadataLocationType): DeveloperMetadataFinder
  
  def withValue(value: String): DeveloperMetadataFinder
  
  def withVisibility(visibility: DeveloperMetadataVisibility): DeveloperMetadataFinder
}
object DeveloperMetadataFinder {
  
  inline def apply(
    find: CallbackTo[js.Array[DeveloperMetadata]],
    onIntersectingLocations: CallbackTo[DeveloperMetadataFinder],
    withId: Integer => DeveloperMetadataFinder,
    withKey: String => DeveloperMetadataFinder,
    withLocationType: DeveloperMetadataLocationType => DeveloperMetadataFinder,
    withValue: String => DeveloperMetadataFinder,
    withVisibility: DeveloperMetadataVisibility => DeveloperMetadataFinder
  ): DeveloperMetadataFinder = {
    val __obj = js.Dynamic.literal(find = find.toJsFn, onIntersectingLocations = onIntersectingLocations.toJsFn, withId = js.Any.fromFunction1(withId), withKey = js.Any.fromFunction1(withKey), withLocationType = js.Any.fromFunction1(withLocationType), withValue = js.Any.fromFunction1(withValue), withVisibility = js.Any.fromFunction1(withVisibility))
    __obj.asInstanceOf[DeveloperMetadataFinder]
  }
  
  extension [Self <: DeveloperMetadataFinder](x: Self) {
    
    inline def setFind(value: CallbackTo[js.Array[DeveloperMetadata]]): Self = StObject.set(x, "find", value.toJsFn)
    
    inline def setOnIntersectingLocations(value: CallbackTo[DeveloperMetadataFinder]): Self = StObject.set(x, "onIntersectingLocations", value.toJsFn)
    
    inline def setWithId(value: Integer => DeveloperMetadataFinder): Self = StObject.set(x, "withId", js.Any.fromFunction1(value))
    
    inline def setWithKey(value: String => DeveloperMetadataFinder): Self = StObject.set(x, "withKey", js.Any.fromFunction1(value))
    
    inline def setWithLocationType(value: DeveloperMetadataLocationType => DeveloperMetadataFinder): Self = StObject.set(x, "withLocationType", js.Any.fromFunction1(value))
    
    inline def setWithValue(value: String => DeveloperMetadataFinder): Self = StObject.set(x, "withValue", js.Any.fromFunction1(value))
    
    inline def setWithVisibility(value: DeveloperMetadataVisibility => DeveloperMetadataFinder): Self = StObject.set(x, "withVisibility", js.Any.fromFunction1(value))
  }
}
