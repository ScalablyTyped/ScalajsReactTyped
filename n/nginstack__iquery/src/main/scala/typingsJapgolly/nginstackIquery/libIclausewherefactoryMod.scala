package typingsJapgolly.nginstackIquery

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIclausewherefactoryMod {
  
  inline def apply(): Unit = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IClauseWhereFactory", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with IClauseWhereFactory
  @JSImport("@nginstack/iquery/lib/IClauseWhereFactory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type IClauseJoin = typingsJapgolly.nginstackIquery.libIclausejoinMod.^
  
  @js.native
  trait IClauseWhereFactory extends StObject {
    
    /* private */ var _prepareField: Any = js.native
    
    /* private */ var _prepareOperator: Any = js.native
    
    /* private */ var _setValue: Any = js.native
    
    def getClauseWhere(iQuery: IQuery, clause: Record[Any, Any]): typingsJapgolly.nginstackIquery.libIclausewhereMod.^ = js.native
    def getClauseWhere(iQuery: IQuery, clause: Record[Any, Any], join: Boolean): typingsJapgolly.nginstackIquery.libIclausewhereMod.^ = js.native
    
    var owner: IQuery | IClauseJoin = js.native
  }
  
  type IQuery = typingsJapgolly.nginstackIquery.libIqueryMod.^
}
