package typingsJapgolly.officeJs.PowerPoint.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the collection of tags.
  *
  * @remarks
  * [Api set: PowerPointApi 1.3]
  */
trait TagCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the unique ID of the tag. The `key` is unique within the owning `TagCollection` and always stored as uppercase letters within the document.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var key: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the value of the tag.
    *
    * @remarks
    * [Api set: PowerPointApi 1.3]
    */
  var value: js.UndefOr[Boolean] = js.undefined
}
object TagCollectionLoadOptions {
  
  inline def apply(): TagCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagCollectionLoadOptions]
  }
  
  extension [Self <: TagCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setKey(value: Boolean): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
