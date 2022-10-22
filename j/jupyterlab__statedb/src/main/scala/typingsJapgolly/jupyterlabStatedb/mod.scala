package typingsJapgolly.jupyterlabStatedb

import typingsJapgolly.jupyterlabStatedb.libRestorablepoolMod.RestorablePool.IOptions
import typingsJapgolly.luminoCoreutils.mod.Token
import typingsJapgolly.luminoCoreutils.typesJsonMod.ReadonlyPartialJSONValue
import typingsJapgolly.luminoDisposable.mod.IObservableDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("@jupyterlab/statedb", "DataConnector")
  @js.native
  open class DataConnector[T, U, V, W] ()
    extends typingsJapgolly.jupyterlabStatedb.libDataconnectorMod.DataConnector[T, U, V, W]
  
  @JSImport("@jupyterlab/statedb", "IStateDB")
  @js.native
  val IStateDB: Token[
    typingsJapgolly.jupyterlabStatedb.libTokensMod.IStateDB[ReadonlyPartialJSONValue]
  ] = js.native
  
  @JSImport("@jupyterlab/statedb", "RestorablePool")
  @js.native
  open class RestorablePool[T /* <: IObservableDisposable */] protected ()
    extends typingsJapgolly.jupyterlabStatedb.libRestorablepoolMod.RestorablePool[T] {
    /**
      * Create a new restorable pool.
      *
      * @param options - The instantiation options for a restorable pool.
      */
    def this(options: IOptions) = this()
  }
  
  @JSImport("@jupyterlab/statedb", "StateDB")
  @js.native
  /**
    * Create a new state database.
    *
    * @param options - The instantiation options for a state database.
    */
  open class StateDB[T /* <: ReadonlyPartialJSONValue */] ()
    extends typingsJapgolly.jupyterlabStatedb.libStatedbMod.StateDB[T] {
    def this(options: typingsJapgolly.jupyterlabStatedb.libStatedbMod.StateDB.IOptions[T]) = this()
  }
  object StateDB {
    
    /**
      * An in-memory string key/value data connector.
      */
    @JSImport("@jupyterlab/statedb", "StateDB.Connector")
    @js.native
    open class Connector ()
      extends typingsJapgolly.jupyterlabStatedb.libStatedbMod.StateDB.Connector
  }
}
