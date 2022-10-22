package typingsJapgolly.iobroker.mod.global.ioBroker

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.iobroker.anon.Data
import typingsJapgolly.iobroker.anon.IdString
import typingsJapgolly.iobroker.anon.KinkeyofStateStateK
import typingsJapgolly.iobroker.anon.KinkeyofStateStateKAck
import typingsJapgolly.iobroker.anon.Rows
import typingsJapgolly.iobroker.anon.RowsArray
import typingsJapgolly.iobroker.anon.Stateidstringundefined
import typingsJapgolly.iobroker.anon.Type
import typingsJapgolly.iobroker.anon.Value
import typingsJapgolly.iobroker.iobrokerStrings.read
import typingsJapgolly.iobroker.mod.AtLeastOne
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.AnyObject
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.BaseObject
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.Object
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.ObjectIdToObjectType
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.ObjectType
import typingsJapgolly.iobroker.objectsMod.global.ioBroker.StringOrTranslated
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/** Infers the return type from a callback-style API and and leaves null and undefined in */
type CallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ Any, Any] */] = SecondParameterOf[T]

type ChownFileCallback = js.Function2[
/* err */ js.UndefOr[ErrnoException | Null], 
/* processed */ js.UndefOr[js.Array[ChownFileResult]], 
Unit]

type ChownObjectCallback = js.Function2[
/* err */ js.UndefOr[ErrnoException | Null], 
/* list */ js.UndefOr[js.Array[Object]], 
Unit]

type DeleteStateCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* id */ js.UndefOr[String], Unit]

type EmptyCallback = js.Function0[Unit]

type Enum = Any

// TODO: define this https://github.com/ioBroker/ioBroker.js-controller/blob/master/lib/states/statesInMemServer.js#L873
type EnumList = String | js.Array[String]

/** Special variant of ErrorCallback for methods where Node.js returns an ErrnoException */
type ErrnoCallback = js.Function1[/* err */ js.UndefOr[ErrnoException | Null], Unit]

type ErrorCallback = js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]

type ErrorHandler = js.Function1[/* err */ js.Error, Boolean]

type ExtendObjectCallback = js.Function3[
/* err */ js.UndefOr[js.Error | Null], 
/* result */ js.UndefOr[Value], 
/* id */ js.UndefOr[String], 
Unit]

type FindObjectCallback = js.Function3[
/* err */ js.UndefOr[js.Error | Null], 
/* id */ js.UndefOr[String], 
/* name */ js.UndefOr[StringOrTranslated], 
Unit]

// TODO: Redefine callbacks as subclass of GenericCallback
type GenericCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[T], Unit]

type GetBinaryStateCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* state */ js.UndefOr[Buffer], Unit]

type GetBinaryStatePromise = js.Promise[CallbackReturnTypeOf[GetBinaryStateCallback]]

type GetConfigKeysCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* list */ js.UndefOr[js.Array[String]], Unit]

type GetEnumCallback = js.Function3[
/* err */ js.UndefOr[js.Error | Null], 
/* enums */ js.UndefOr[Record[String, Enum]], 
/* requestedEnum */ js.UndefOr[String], 
Unit]

type GetEnumsCallback = js.Function2[
/* err */ js.UndefOr[js.Error | Null], 
/* result */ js.UndefOr[StringDictionary[Record[String, Enum]]], 
Unit]

type GetEnumsPromise = js.Promise[NonNullCallbackReturnTypeOf[GetEnumsCallback]]

type GetHistoryCallback = js.Function4[
/* err */ js.Error | Null, 
/* result */ js.UndefOr[GetHistoryResult], 
/* step */ js.UndefOr[Double], 
/* sessionId */ js.UndefOr[String], 
Unit]

type GetHistoryResult = js.Array[Stateidstringundefined]

type GetObjectCallback[T /* <: String */] = js.Function2[
/* err */ js.UndefOr[js.Error | Null], 
/* obj */ js.UndefOr[(ObjectIdToObjectType[T, read]) | Null], 
Unit]

type GetObjectListCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[RowsArray], Unit]

/** Parameters for adapter.getObjectList */
type GetObjectListParams = GetObjectViewParams

type GetObjectListPromise = js.Promise[NonNullCallbackReturnTypeOf[GetObjectListCallback]]

type GetObjectPromise[T /* <: String */] = js.Promise[CallbackReturnTypeOf[GetObjectCallback[T]]]

type GetObjectViewCallback[T] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[Rows[T]], Unit]

type GetObjectViewPromise[T] = js.Promise[NonNullCallbackReturnTypeOf[GetObjectViewCallback[T]]]

type GetObjectsCallback = js.Function2[
/* err */ js.UndefOr[js.Error | Null], 
/* objects */ js.UndefOr[Record[String, Object]], 
Unit]

// This is a version used by GetDevices/GetChannelsOf/GetStatesOf
type GetObjectsCallback3[T /* <: BaseObject */] = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* result */ js.UndefOr[js.Array[T]], Unit]

type GetObjectsCallbackTyped[T /* <: ObjectType */] = js.Function2[
/* err */ js.UndefOr[js.Error | Null], 
/* objects */ js.UndefOr[Record[String, AnyObject & Type[T]]], 
Unit]

type GetObjectsPromise = js.Promise[NonNullCallbackReturnTypeOf[GetObjectsCallback]]

type GetObjectsPromiseTyped[T /* <: ObjectType */] = js.Promise[NonNullCallbackReturnTypeOf[GetObjectsCallbackTyped[T]]]

type GetSessionCallback = js.Function1[/* session */ Session, Unit]

type GetStateCallback = js.Function2[/* err */ js.Error | Null, /* state */ js.UndefOr[State | Null], Unit]

type GetStatePromise = js.Promise[CallbackReturnTypeOf[GetStateCallback]]

type GetStatesCallback = js.Function2[/* err */ js.Error | Null, /* states */ js.UndefOr[Record[String, State]], Unit]

type GetStatesPromise = js.Promise[NonNullCallbackReturnTypeOf[GetStatesCallback]]

type Log = Any

type MessageCallback = js.Function1[/* response */ js.UndefOr[Message], Unit]

type MessageHandler = js.Function1[/* obj */ Message, Unit | js.Promise[Unit]]

type MessagePayload = String | (Record[String, Any])

/** Infers the return type from a callback-style API and strips out null and undefined */
type NonNullCallbackReturnTypeOf[T /* <: js.Function1[/* repeated */ Any, Any] */] = Exclude[SecondParameterOf[T], js.UndefOr[Null]]

type ObjectChangeHandler = js.Function2[/* id */ String, /* obj */ js.UndefOr[Object | Null], Unit | js.Promise[Unit]]

// TODO: implement this
type Plugin = Record[String, Any]

type ReadDirCallback = js.Function2[
/* err */ js.UndefOr[ErrnoException | Null], 
/* entries */ js.UndefOr[js.Array[ReadDirResult]], 
Unit]

type ReadDirPromise = js.Promise[NonNullCallbackReturnTypeOf[ReadDirCallback]]

type ReadFileCallback = js.Function3[
/* err */ js.UndefOr[ErrnoException | Null], 
/* data */ js.UndefOr[Buffer | String], 
/* mimeType */ js.UndefOr[String], 
Unit]

type ReadFilePromise = js.Promise[Data]

// end interface Adapter
type ReadyHandler = js.Function0[Unit | js.Promise[Unit]]

type RmCallback = js.Function2[
/* err */ js.UndefOr[ErrnoException | Null], 
/* entries */ js.UndefOr[js.Array[RmResult]], 
Unit]

type Session = Any

type SetObjectCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* obj */ js.UndefOr[IdString], Unit]

type SetObjectPromise = js.Promise[NonNullCallbackReturnTypeOf[SetObjectCallback]]

type SetStateCallback = js.Function2[/* err */ js.UndefOr[js.Error | Null], /* id */ js.UndefOr[String], Unit]

type SetStateChangedCallback = js.Function3[
/* err */ js.Error | Null, 
/* id */ js.UndefOr[String], 
/* notChanged */ js.UndefOr[Boolean], 
Unit]

type SetStateChangedPromise = js.Promise[NonNullCallbackReturnTypeOf[SetStateChangedCallback]]

type SetStatePromise = js.Promise[NonNullCallbackReturnTypeOf[SetStateCallback]]

type SettableState = AtLeastOne[State, KinkeyofStateStateK, KinkeyofStateStateKAck]

type StateChangeHandler = js.Function2[/* id */ String, /* obj */ js.UndefOr[State | Null], Unit | js.Promise[Unit]]

type StateValue = String | Double | Boolean | Null

type UnloadHandler = (js.Function1[/* callback */ EmptyCallback, Unit]) | js.Function0[js.Promise[Unit]]

type UserGroup = Any
