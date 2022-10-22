package typingsJapgolly.googleAppsScript.GoogleAppsScript.Document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Range that has a name and ID to allow later retrieval. Names are not
  * necessarily unique; several different ranges in the same document may share the same name, much
  * like a class in HTML. By contrast, IDs are unique within the document, like an ID in HTML. Once a
  * NamedRange has been added to a document, it cannot be modified, only removed.
  *
  * A NamedRange can be accessed by any script that accesses the document. To avoid
  * unintended conflicts between scripts, consider prefixing range names with a unique string.
  *
  *     // Create a named range that includes every table in the document.
  *     var doc = DocumentApp.getActiveDocument();
  *     var rangeBuilder = doc.newRange();
  *     var tables = doc.getBody().getTables();
  *     for (var i = 0; i < tables.length; i++) {
  *       rangeBuilder.addElement(tables[i]);
  *     }
  *     doc.addNamedRange('myUniquePrefix-tables', rangeBuilder.build());
  */
trait NamedRange extends StObject {
  
  def getId(): String
  
  def getName(): String
  
  def getRange(): Range
  
  def remove(): Unit
}
object NamedRange {
  
  inline def apply(
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    getRange: CallbackTo[Range],
    remove: Callback
  ): NamedRange = {
    val __obj = js.Dynamic.literal(getId = getId.toJsFn, getName = getName.toJsFn, getRange = getRange.toJsFn, remove = remove.toJsFn)
    __obj.asInstanceOf[NamedRange]
  }
  
  extension [Self <: NamedRange](x: Self) {
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetRange(value: CallbackTo[Range]): Self = StObject.set(x, "getRange", value.toJsFn)
    
    inline def setRemove(value: Callback): Self = StObject.set(x, "remove", value.toJsFn)
  }
}
