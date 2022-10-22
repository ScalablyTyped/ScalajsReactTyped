package typingsJapgolly.devextreme.mod.DevExpress.data

import typingsJapgolly.devextreme.anon.`0`
import typingsJapgolly.devextreme.anon.`1`
import typingsJapgolly.devextreme.anon.`2`
import typingsJapgolly.devextreme.mod.DevExpress.data.CustomStore.Options
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource._DataSourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utils {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.devextreme.mod.DevExpress.data.CustomStore[TItem, TKey]
    - typingsJapgolly.devextreme.mod.DevExpress.data.ArrayStore[TItem, TKey]
    - typingsJapgolly.devextreme.mod.DevExpress.data.LocalStore[TItem, TKey]
    - typingsJapgolly.devextreme.mod.DevExpress.data.ODataStore[TItem, TKey]
  */
  trait Store[TItem, TKey]
    extends StObject
       with _DataSourceLike[TItem, TKey]
  
  type StoreOptions[TItem, TKey] = (Options[TItem, TKey]) | ((typingsJapgolly.devextreme.mod.DevExpress.data.ArrayStore.Options[TItem, TKey]) & `0`) | ((typingsJapgolly.devextreme.mod.DevExpress.data.LocalStore.Options[TItem, TKey]) & `1`) | ((typingsJapgolly.devextreme.mod.DevExpress.data.ODataStore.Options[TItem, TKey]) & `2`)
}
