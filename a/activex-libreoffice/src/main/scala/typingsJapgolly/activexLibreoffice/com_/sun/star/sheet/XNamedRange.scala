package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the settings of a named range in a spreadsheet document.
  * @see com.sun.star.sheet.NamedRange
  */
trait XNamedRange
  extends StObject
     with XNamed {
  
  /**
    * returns the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  var Content: String
  
  /** returns the position in the document which is used as a base for relative references in the content. */
  var ReferencePosition: CellAddress
  
  /**
    * returns the type of the named range.
    *
    * This is a combination of flags as defined in {@link NamedRangeFlag} .
    */
  var Type: Double
  
  /**
    * returns the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  def getContent(): String
  
  /** returns the position in the document which is used as a base for relative references in the content. */
  def getReferencePosition(): CellAddress
  
  /**
    * returns the type of the named range.
    *
    * This is a combination of flags as defined in {@link NamedRangeFlag} .
    */
  def getType(): Double
  
  /**
    * sets the content of the named range.
    *
    * The content can be a reference to a cell or cell range or any formula expression.
    */
  def setContent(aContent: String): Unit
  
  /** sets the position in the document which is used as a base for relative references in the content. */
  def setReferencePosition(aReferencePosition: CellAddress): Unit
  
  /**
    * sets the type of the named range.
    * @param nType a combination of flags that specify the type of a named range, as defined in {@link NamedRangeFlag} .
    */
  def setType(nType: Double): Unit
}
object XNamedRange {
  
  inline def apply(
    Content: String,
    Name: String,
    ReferencePosition: CellAddress,
    Type: Double,
    acquire: Callback,
    getContent: CallbackTo[String],
    getName: CallbackTo[String],
    getReferencePosition: CallbackTo[CellAddress],
    getType: CallbackTo[Double],
    queryInterface: `type` => Any,
    release: Callback,
    setContent: String => Callback,
    setName: String => Callback,
    setReferencePosition: CellAddress => Callback,
    setType: Double => Callback
  ): XNamedRange = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReferencePosition = ReferencePosition.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getContent = getContent.toJsFn, getName = getName.toJsFn, getReferencePosition = getReferencePosition.toJsFn, getType = getType.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setContent = js.Any.fromFunction1((t0: String) => setContent(t0).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setReferencePosition = js.Any.fromFunction1((t0: CellAddress) => setReferencePosition(t0).runNow()), setType = js.Any.fromFunction1((t0: Double) => setType(t0).runNow()))
    __obj.asInstanceOf[XNamedRange]
  }
  
  extension [Self <: XNamedRange](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setGetContent(value: CallbackTo[String]): Self = StObject.set(x, "getContent", value.toJsFn)
    
    inline def setGetReferencePosition(value: CallbackTo[CellAddress]): Self = StObject.set(x, "getReferencePosition", value.toJsFn)
    
    inline def setGetType(value: CallbackTo[Double]): Self = StObject.set(x, "getType", value.toJsFn)
    
    inline def setReferencePosition(value: CellAddress): Self = StObject.set(x, "ReferencePosition", value.asInstanceOf[js.Any])
    
    inline def setSetContent(value: String => Callback): Self = StObject.set(x, "setContent", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetReferencePosition(value: CellAddress => Callback): Self = StObject.set(x, "setReferencePosition", js.Any.fromFunction1((t0: CellAddress) => value(t0).runNow()))
    
    inline def setSetType(value: Double => Callback): Self = StObject.set(x, "setType", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
