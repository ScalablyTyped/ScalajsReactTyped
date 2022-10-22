package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a hierarchy in a data pilot source dimension.
  * @see com.sun.star.sheet.DataPilotSourceDimension
  * @see com.sun.star.sheet.DataPilotSource
  */
trait DataPilotSourceHierarchy
  extends StObject
     with XNamed
     with XLevelsSupplier
object DataPilotSourceHierarchy {
  
  inline def apply(
    Levels: XNameAccess,
    Name: String,
    acquire: Callback,
    getLevels: CallbackTo[XNameAccess],
    getName: CallbackTo[String],
    queryInterface: `type` => Any,
    release: Callback,
    setName: String => Callback
  ): DataPilotSourceHierarchy = {
    val __obj = js.Dynamic.literal(Levels = Levels.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLevels = getLevels.toJsFn, getName = getName.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()))
    __obj.asInstanceOf[DataPilotSourceHierarchy]
  }
}
