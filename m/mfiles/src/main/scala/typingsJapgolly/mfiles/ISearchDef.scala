package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.mfiles.MFiles.MFSearchFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISearchDef extends StObject {
  
  def Clone(): ISearchDef
  
  var Conditions: ISearchConditions
  
  def IsIndirectionUsed(): Boolean
  
  var Levels: IExpressionExs
  
  var LookInAllVersions: Boolean
  
  var ReturnLatestVisibleVersion: Boolean
  
  var SearchFlags: MFSearchFlags
}
object ISearchDef {
  
  inline def apply(
    Clone: CallbackTo[ISearchDef],
    Conditions: ISearchConditions,
    IsIndirectionUsed: CallbackTo[Boolean],
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    ReturnLatestVisibleVersion: Boolean,
    SearchFlags: MFSearchFlags
  ): ISearchDef = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, Conditions = Conditions.asInstanceOf[js.Any], IsIndirectionUsed = IsIndirectionUsed.toJsFn, Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchDef]
  }
  
  extension [Self <: ISearchDef](x: Self) {
    
    inline def setClone(value: CallbackTo[ISearchDef]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setConditions(value: ISearchConditions): Self = StObject.set(x, "Conditions", value.asInstanceOf[js.Any])
    
    inline def setIsIndirectionUsed(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsIndirectionUsed", value.toJsFn)
    
    inline def setLevels(value: IExpressionExs): Self = StObject.set(x, "Levels", value.asInstanceOf[js.Any])
    
    inline def setLookInAllVersions(value: Boolean): Self = StObject.set(x, "LookInAllVersions", value.asInstanceOf[js.Any])
    
    inline def setReturnLatestVisibleVersion(value: Boolean): Self = StObject.set(x, "ReturnLatestVisibleVersion", value.asInstanceOf[js.Any])
    
    inline def setSearchFlags(value: MFSearchFlags): Self = StObject.set(x, "SearchFlags", value.asInstanceOf[js.Any])
  }
}
