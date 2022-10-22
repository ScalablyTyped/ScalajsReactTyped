package typingsJapgolly.ngTable

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCoreGroupingGroupingFuncMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ngTable.ngTableStrings._empty
    - typingsJapgolly.ngTable.ngTableStrings.asc
    - typingsJapgolly.ngTable.ngTableStrings.desc
  */
  trait GroupSort extends StObject
  object GroupSort {
    
    inline def _empty: typingsJapgolly.ngTable.ngTableStrings._empty = "".asInstanceOf[typingsJapgolly.ngTable.ngTableStrings._empty]
    
    inline def asc: typingsJapgolly.ngTable.ngTableStrings.asc = "asc".asInstanceOf[typingsJapgolly.ngTable.ngTableStrings.asc]
    
    inline def desc: typingsJapgolly.ngTable.ngTableStrings.desc = "desc".asInstanceOf[typingsJapgolly.ngTable.ngTableStrings.desc]
  }
  
  type Grouping[T] = IGroupValues | IGroupingFunc[T]
  
  type IGroupValues = StringDictionary[GroupSort]
  
  @js.native
  trait IGroupingFunc[T] extends StObject {
    
    def apply(item: T): String = js.native
    
    /**
      * leave undefined to let the value of `ISettings.groupOptions.defaultSort` apply
      */
    var sortDirection: js.UndefOr[GroupSort] = js.native
    
    var title: js.UndefOr[String] = js.native
  }
}
