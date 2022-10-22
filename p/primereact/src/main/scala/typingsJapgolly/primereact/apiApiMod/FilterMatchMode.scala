package typingsJapgolly.primereact.apiApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FilterMatchMode extends StObject
@JSImport("primereact/api/api", "FilterMatchMode")
@js.native
object FilterMatchMode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FilterMatchMode & String] = js.native
  
  @js.native
  sealed trait BETWEEN
    extends StObject
       with FilterMatchMode
  /* "between" */ val BETWEEN: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.BETWEEN & String = js.native
  
  @js.native
  sealed trait CONTAINS
    extends StObject
       with FilterMatchMode
  /* "contains" */ val CONTAINS: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.CONTAINS & String = js.native
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with FilterMatchMode
  /* "custom" */ val CUSTOM: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.CUSTOM & String = js.native
  
  @js.native
  sealed trait DATE_AFTER
    extends StObject
       with FilterMatchMode
  /* "dateAfter" */ val DATE_AFTER: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.DATE_AFTER & String = js.native
  
  @js.native
  sealed trait DATE_BEFORE
    extends StObject
       with FilterMatchMode
  /* "dateBefore" */ val DATE_BEFORE: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.DATE_BEFORE & String = js.native
  
  @js.native
  sealed trait DATE_IS
    extends StObject
       with FilterMatchMode
  /* "dateIs" */ val DATE_IS: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.DATE_IS & String = js.native
  
  @js.native
  sealed trait DATE_IS_NOT
    extends StObject
       with FilterMatchMode
  /* "dateIsNot" */ val DATE_IS_NOT: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.DATE_IS_NOT & String = js.native
  
  @js.native
  sealed trait ENDS_WITH
    extends StObject
       with FilterMatchMode
  /* "endsWith" */ val ENDS_WITH: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.ENDS_WITH & String = js.native
  
  @js.native
  sealed trait EQUALS
    extends StObject
       with FilterMatchMode
  /* "equals" */ val EQUALS: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.EQUALS & String = js.native
  
  @js.native
  sealed trait GREATER_THAN
    extends StObject
       with FilterMatchMode
  /* "gt" */ val GREATER_THAN: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.GREATER_THAN & String = js.native
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL_TO
    extends StObject
       with FilterMatchMode
  /* "gte" */ val GREATER_THAN_OR_EQUAL_TO: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.GREATER_THAN_OR_EQUAL_TO & String = js.native
  
  @js.native
  sealed trait IN
    extends StObject
       with FilterMatchMode
  /* "in" */ val IN: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.IN & String = js.native
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with FilterMatchMode
  /* "lt" */ val LESS_THAN: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.LESS_THAN & String = js.native
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL_TO
    extends StObject
       with FilterMatchMode
  /* "lte" */ val LESS_THAN_OR_EQUAL_TO: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.LESS_THAN_OR_EQUAL_TO & String = js.native
  
  @js.native
  sealed trait NOT_CONTAINS
    extends StObject
       with FilterMatchMode
  /* "notContains" */ val NOT_CONTAINS: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.NOT_CONTAINS & String = js.native
  
  @js.native
  sealed trait NOT_EQUALS
    extends StObject
       with FilterMatchMode
  /* "notEquals" */ val NOT_EQUALS: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.NOT_EQUALS & String = js.native
  
  @js.native
  sealed trait STARTS_WITH
    extends StObject
       with FilterMatchMode
  /* "startsWith" */ val STARTS_WITH: typingsJapgolly.primereact.apiApiMod.FilterMatchMode.STARTS_WITH & String = js.native
}
