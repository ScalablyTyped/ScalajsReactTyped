package typingsJapgolly.memcached

import typingsJapgolly.memcached.mod.EventNames
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memcachedStrings {
  
  @js.native
  sealed trait failure
    extends StObject
       with EventNames
  inline def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait issue
    extends StObject
       with EventNames
  inline def issue: issue = "issue".asInstanceOf[issue]
  
  @js.native
  sealed trait reconnect
    extends StObject
       with EventNames
  inline def reconnect: reconnect = "reconnect".asInstanceOf[reconnect]
  
  @js.native
  sealed trait reconnecting
    extends StObject
       with EventNames
  inline def reconnecting: reconnecting = "reconnecting".asInstanceOf[reconnecting]
  
  @js.native
  sealed trait remove
    extends StObject
       with EventNames
  inline def remove: remove = "remove".asInstanceOf[remove]
}
