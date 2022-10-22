package typingsJapgolly.oracleOraclejet

import typingsJapgolly.oracleOraclejet.ojkeysetMod.ExpandAllKeySet
import typingsJapgolly.oracleOraclejet.ojkeysetMod.ExpandedKeySet
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojknockoutKeysetMod {
  
  @JSImport("@oracle/oraclejet/ojknockout-keyset", "ObservableExpandedKeySet")
  @js.native
  open class ObservableExpandedKeySet[K] () extends StObject {
    def this(initialValue: ExpandAllKeySet[K]) = this()
    def this(initialValue: ExpandedKeySet[K]) = this()
    
    def add(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
    def add(keys: Set[K]): ObservableExpandedKeySet[K] = js.native
    
    def addAll(): ObservableExpandedKeySet[K] = js.native
    
    def clear(): ObservableExpandedKeySet[K] = js.native
    
    def delete(keys: js.Array[K]): ObservableExpandedKeySet[K] = js.native
    def delete(keys: Set[K]): ObservableExpandedKeySet[K] = js.native
  }
}
