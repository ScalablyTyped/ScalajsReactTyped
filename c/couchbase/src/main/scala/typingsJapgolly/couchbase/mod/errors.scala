package typingsJapgolly.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait errors extends StObject
/**
  * Enumeration of all error codes. See libcouchbase documentation for more details on what these errors represent.
  */
@JSImport("couchbase", "errors")
@js.native
object errors extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[errors & Double] = js.native
  
  /** Authentication should continue. **/
  @js.native
  sealed trait authContinue
    extends StObject
       with errors
  /* 1 */ val authContinue: typingsJapgolly.couchbase.mod.errors.authContinue & Double = js.native
  
  /** Error authenticating. **/
  @js.native
  sealed trait authError
    extends StObject
       with errors
  /* 2 */ val authError: typingsJapgolly.couchbase.mod.errors.authError & Double = js.native
  
  /** A bad environment variable was specified. **/
  @js.native
  sealed trait badEnvironmentVariable
    extends StObject
       with errors
  /* 35 */ val badEnvironmentVariable: typingsJapgolly.couchbase.mod.errors.badEnvironmentVariable & Double = js.native
  
  /** A bad handle was passed. **/
  @js.native
  sealed trait badHandle
    extends StObject
       with errors
  /* 29 */ val badHandle: typingsJapgolly.couchbase.mod.errors.badHandle & Double = js.native
  
  /** The bucket you request was not found. **/
  @js.native
  sealed trait bukcketNotFound
    extends StObject
       with errors
  /* 26 */ val bukcketNotFound: typingsJapgolly.couchbase.mod.errors.bukcketNotFound & Double = js.native
  
  /** An unknown error occured within libcouchbase. **/
  @js.native
  sealed trait cLibGenericError
    extends StObject
       with errors
  /* 10 */ val cLibGenericError: typingsJapgolly.couchbase.mod.errors.cLibGenericError & Double = js.native
  
  /** Server is too busy to handle your request right now. **/
  @js.native
  sealed trait cLibInternal
    extends StObject
       with errors
  /* 6 */ val cLibInternal: typingsJapgolly.couchbase.mod.errors.cLibInternal & Double = js.native
  
  /** The server is out of memory. **/
  @js.native
  sealed trait cLibOutOfMemory
    extends StObject
       with errors
  /* 8 */ val cLibOutOfMemory: typingsJapgolly.couchbase.mod.errors.cLibOutOfMemory & Double = js.native
  
  /** An invalid arguement was passed. **/
  @js.native
  sealed trait cLinInvalidArgument
    extends StObject
       with errors
  /* 7 */ val cLinInvalidArgument: typingsJapgolly.couchbase.mod.errors.cLinInvalidArgument & Double = js.native
  
  /** Not all operations completed successfully. **/
  @js.native
  sealed trait checkResults
    extends StObject
       with errors
  /* 39 */ val checkResults: typingsJapgolly.couchbase.mod.errors.checkResults & Double = js.native
  
  /** libcouchbase is out of memory. **/
  @js.native
  sealed trait clientOutOfMemory
    extends StObject
       with errors
  /* 27 */ val clientOutOfMemory: typingsJapgolly.couchbase.mod.errors.clientOutOfMemory & Double = js.native
  
  /** A temporary error occured in libcouchbase. Try again. **/
  @js.native
  sealed trait clientTemporaryError
    extends StObject
       with errors
  /* 28 */ val clientTemporaryError: typingsJapgolly.couchbase.mod.errors.clientTemporaryError & Double = js.native
  
  /** Error connecting to the server. **/
  @js.native
  sealed trait connectError
    extends StObject
       with errors
  /* 25 */ val connectError: typingsJapgolly.couchbase.mod.errors.connectError & Double = js.native
  
  /** The passed incr/decr delta was invalid. **/
  @js.native
  sealed trait deltaBadVal
    extends StObject
       with errors
  /* 3 */ val deltaBadVal: typingsJapgolly.couchbase.mod.errors.deltaBadVal & Double = js.native
  
  /** Duplicate items. **/
  @js.native
  sealed trait duplicateItems
    extends StObject
       with errors
  /* 33 */ val duplicateItems: typingsJapgolly.couchbase.mod.errors.duplicateItems & Double = js.native
  
  /** The specified durability requirements could not be satisfied. **/
  @js.native
  sealed trait durabilityFailed
    extends StObject
       with errors
  /* 41 */ val durabilityFailed: typingsJapgolly.couchbase.mod.errors.durabilityFailed & Double = js.native
  
  /** Failed to find expected symbol in library. **/
  @js.native
  sealed trait failedToFindSymbol
    extends StObject
       with errors
  /* 15 */ val failedToFindSymbol: typingsJapgolly.couchbase.mod.errors.failedToFindSymbol & Double = js.native
  
  /** Failed to open library. **/
  @js.native
  sealed trait failedToOpenLibrary
    extends StObject
       with errors
  /* 14 */ val failedToOpenLibrary: typingsJapgolly.couchbase.mod.errors.failedToOpenLibrary & Double = js.native
  
  /** A generic error occured in Couchnode. **/
  @js.native
  sealed trait genericError
    extends StObject
       with errors
  /* 40 */ val genericError: typingsJapgolly.couchbase.mod.errors.genericError & Double = js.native
  
  /** Invalid arguements were passed. **/
  @js.native
  sealed trait invalidArguments
    extends StObject
       with errors
  /* 37 */ val invalidArguments: typingsJapgolly.couchbase.mod.errors.invalidArguments & Double = js.native
  
  /** The host format specified is invalid. **/
  @js.native
  sealed trait invalidHostFormat
    extends StObject
       with errors
  /* 31 */ val invalidHostFormat: typingsJapgolly.couchbase.mod.errors.invalidHostFormat & Double = js.native
  
  /** An invalid range was specified. **/
  @js.native
  sealed trait invalidRange
    extends StObject
       with errors
  /* 9 */ val invalidRange: typingsJapgolly.couchbase.mod.errors.invalidRange & Double = js.native
  
  /** The key already exists on the server. **/
  @js.native
  sealed trait keyAlreadyExists
    extends StObject
       with errors
  /* 12 */ val keyAlreadyExists: typingsJapgolly.couchbase.mod.errors.keyAlreadyExists & Double = js.native
  
  /** The key does not exist on the server. **/
  @js.native
  sealed trait keyNotFound
    extends StObject
       with errors
  /* 13 */ val keyNotFound: typingsJapgolly.couchbase.mod.errors.keyNotFound & Double = js.native
  
  /** A network error occured. **/
  @js.native
  sealed trait networkError
    extends StObject
       with errors
  /* 16 */ val networkError: typingsJapgolly.couchbase.mod.errors.networkError & Double = js.native
  
  /** Key mapping failed and could not match a server. **/
  @js.native
  sealed trait noMatchingServerForKey
    extends StObject
       with errors
  /* 34 */ val noMatchingServerForKey: typingsJapgolly.couchbase.mod.errors.noMatchingServerForKey & Double = js.native
  
  /**  Not enough nodes to meet the operations durability requirements. **/
  @js.native
  sealed trait notEnoughNodes
    extends StObject
       with errors
  /* 32 */ val notEnoughNodes: typingsJapgolly.couchbase.mod.errors.notEnoughNodes & Double = js.native
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait notMyVBucket
    extends StObject
       with errors
  /* 18 */ val notMyVBucket: typingsJapgolly.couchbase.mod.errors.notMyVBucket & Double = js.native
  
  /** The document was not stored. **/
  @js.native
  sealed trait notSorted
    extends StObject
       with errors
  /* 19 */ val notSorted: typingsJapgolly.couchbase.mod.errors.notSorted & Double = js.native
  
  /** An unsupported operation was sent to the server. **/
  @js.native
  sealed trait notSupported
    extends StObject
       with errors
  /* 20 */ val notSupported: typingsJapgolly.couchbase.mod.errors.notSupported & Double = js.native
  
  /** Object is too large to be stored on the cluster. **/
  @js.native
  sealed trait objectTooBig
    extends StObject
       with errors
  /* 4 */ val objectTooBig: typingsJapgolly.couchbase.mod.errors.objectTooBig & Double = js.native
  
  /** Couchnode is out of memory. **/
  @js.native
  sealed trait outOfMemory
    extends StObject
       with errors
  /* 36 */ val outOfMemory: typingsJapgolly.couchbase.mod.errors.outOfMemory & Double = js.native
  
  /** A protocol error occured. **/
  @js.native
  sealed trait protocolError
    extends StObject
       with errors
  /* 23 */ val protocolError: typingsJapgolly.couchbase.mod.errors.protocolError & Double = js.native
  
  /** An error occured during a RESTful operation. **/
  @js.native
  sealed trait restError
    extends StObject
       with errors
  /* 42 */ val restError: typingsJapgolly.couchbase.mod.errors.restError & Double = js.native
  
  /** An error occured while trying to schedule the operation. **/
  @js.native
  sealed trait schedulingError
    extends StObject
       with errors
  /* 38 */ val schedulingError: typingsJapgolly.couchbase.mod.errors.schedulingError & Double = js.native
  
  /** A server bug caused the operation to fail. **/
  @js.native
  sealed trait serverBug
    extends StObject
       with errors
  /* 30 */ val serverBug: typingsJapgolly.couchbase.mod.errors.serverBug & Double = js.native
  
  /** Operation was successful. **/
  @js.native
  sealed trait serverBusy
    extends StObject
       with errors
  /* 5 */ val serverBusy: typingsJapgolly.couchbase.mod.errors.serverBusy & Double = js.native
  
  /** Operation was successful. **/
  @js.native
  sealed trait success
    extends StObject
       with errors
  /* 0 */ val success: typingsJapgolly.couchbase.mod.errors.success & Double = js.native
  
  /** A temporary error occured. Try again. **/
  @js.native
  sealed trait temporaryError
    extends StObject
       with errors
  /* 11 */ val temporaryError: typingsJapgolly.couchbase.mod.errors.temporaryError & Double = js.native
  
  /** The operation timed out. **/
  @js.native
  sealed trait timedOut
    extends StObject
       with errors
  /* 24 */ val timedOut: typingsJapgolly.couchbase.mod.errors.timedOut & Double = js.native
  
  /** An unknown command was sent to the server. **/
  @js.native
  sealed trait unknownCommand
    extends StObject
       with errors
  /* 21 */ val unknownCommand: typingsJapgolly.couchbase.mod.errors.unknownCommand & Double = js.native
  
  /** An unknown host was specified. **/
  @js.native
  sealed trait unknownHost
    extends StObject
       with errors
  /* 22 */ val unknownHost: typingsJapgolly.couchbase.mod.errors.unknownHost & Double = js.native
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait wrongServer
    extends StObject
       with errors
  /* 17 */ val wrongServer: typingsJapgolly.couchbase.mod.errors.wrongServer & Double = js.native
}
