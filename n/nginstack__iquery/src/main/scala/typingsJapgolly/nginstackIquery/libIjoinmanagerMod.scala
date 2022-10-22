package typingsJapgolly.nginstackIquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.nginstackIquery.anon.CompleteColumnsNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIjoinmanagerMod {
  
  inline def apply(parent: Any): Unit = ^.asInstanceOf[js.Dynamic].apply(parent.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@nginstack/iquery/lib/IJoinManager", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with IJoinManager {
    def this(parent: Any) = this()
    
    /* private */ /* CompleteClass */
    var _iQuery: Any = js.native
    
    /* private */ /* CompleteClass */
    var _implicitJoinsFieldNames: Any = js.native
    
    /* private */ /* CompleteClass */
    var _joins: Any = js.native
    
    /* CompleteClass */
    override def createExplicitJoin(iQueryJoin: typingsJapgolly.nginstackIquery.libIqueryMod.^, `type`: Any): typingsJapgolly.nginstackIquery.libIclausejoinMod.^ = js.native
    
    /* CompleteClass */
    override def createImplicitJoin(fieldName: String, operator: Any, value: Any): js.Object = js.native
    
    /* CompleteClass */
    override def fieldCanBeNull(fieldName: String): Boolean = js.native
    
    /* CompleteClass */
    override def getColumnsNames(): CompleteColumnsNames = js.native
    
    /* CompleteClass */
    override def getJoinSql(): String = js.native
    
    /* CompleteClass */
    override def getWhereSql(): String = js.native
    
    /* CompleteClass */
    override def iQueryInJoinList(iQuery: typingsJapgolly.nginstackIquery.libIqueryMod.^): Boolean = js.native
  }
  @JSImport("@nginstack/iquery/lib/IJoinManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait IJoinManager extends StObject {
    
    /* private */ var _iQuery: Any
    
    /* private */ var _implicitJoinsFieldNames: Any
    
    /* private */ var _joins: Any
    
    def createExplicitJoin(iQueryJoin: typingsJapgolly.nginstackIquery.libIqueryMod.^, `type`: Any): typingsJapgolly.nginstackIquery.libIclausejoinMod.^
    
    def createImplicitJoin(fieldName: String, operator: Any, value: Any): js.Object
    
    def fieldCanBeNull(fieldName: String): Boolean
    
    def getColumnsNames(): CompleteColumnsNames
    
    def getJoinSql(): String
    
    def getWhereSql(): String
    
    def iQueryInJoinList(iQuery: typingsJapgolly.nginstackIquery.libIqueryMod.^): Boolean
  }
  object IJoinManager {
    
    inline def apply(
      _iQuery: Any,
      _implicitJoinsFieldNames: Any,
      _joins: Any,
      createExplicitJoin: (typingsJapgolly.nginstackIquery.libIqueryMod.^, Any) => typingsJapgolly.nginstackIquery.libIclausejoinMod.^,
      createImplicitJoin: (String, Any, Any) => js.Object,
      fieldCanBeNull: String => Boolean,
      getColumnsNames: CallbackTo[CompleteColumnsNames],
      getJoinSql: CallbackTo[String],
      getWhereSql: CallbackTo[String],
      iQueryInJoinList: typingsJapgolly.nginstackIquery.libIqueryMod.^ => Boolean
    ): IJoinManager = {
      val __obj = js.Dynamic.literal(_iQuery = _iQuery.asInstanceOf[js.Any], _implicitJoinsFieldNames = _implicitJoinsFieldNames.asInstanceOf[js.Any], _joins = _joins.asInstanceOf[js.Any], createExplicitJoin = js.Any.fromFunction2(createExplicitJoin), createImplicitJoin = js.Any.fromFunction3(createImplicitJoin), fieldCanBeNull = js.Any.fromFunction1(fieldCanBeNull), getColumnsNames = getColumnsNames.toJsFn, getJoinSql = getJoinSql.toJsFn, getWhereSql = getWhereSql.toJsFn, iQueryInJoinList = js.Any.fromFunction1(iQueryInJoinList))
      __obj.asInstanceOf[IJoinManager]
    }
    
    extension [Self <: IJoinManager](x: Self) {
      
      inline def setCreateExplicitJoin(
        value: (typingsJapgolly.nginstackIquery.libIqueryMod.^, Any) => typingsJapgolly.nginstackIquery.libIclausejoinMod.^
      ): Self = StObject.set(x, "createExplicitJoin", js.Any.fromFunction2(value))
      
      inline def setCreateImplicitJoin(value: (String, Any, Any) => js.Object): Self = StObject.set(x, "createImplicitJoin", js.Any.fromFunction3(value))
      
      inline def setFieldCanBeNull(value: String => Boolean): Self = StObject.set(x, "fieldCanBeNull", js.Any.fromFunction1(value))
      
      inline def setGetColumnsNames(value: CallbackTo[CompleteColumnsNames]): Self = StObject.set(x, "getColumnsNames", value.toJsFn)
      
      inline def setGetJoinSql(value: CallbackTo[String]): Self = StObject.set(x, "getJoinSql", value.toJsFn)
      
      inline def setGetWhereSql(value: CallbackTo[String]): Self = StObject.set(x, "getWhereSql", value.toJsFn)
      
      inline def setIQueryInJoinList(value: typingsJapgolly.nginstackIquery.libIqueryMod.^ => Boolean): Self = StObject.set(x, "iQueryInJoinList", js.Any.fromFunction1(value))
      
      inline def set_iQuery(value: Any): Self = StObject.set(x, "_iQuery", value.asInstanceOf[js.Any])
      
      inline def set_implicitJoinsFieldNames(value: Any): Self = StObject.set(x, "_implicitJoinsFieldNames", value.asInstanceOf[js.Any])
      
      inline def set_joins(value: Any): Self = StObject.set(x, "_joins", value.asInstanceOf[js.Any])
    }
  }
}
