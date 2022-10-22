package typingsJapgolly.gun

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.gun.anon.Ack
import typingsJapgolly.gun.anon.Bucket
import typingsJapgolly.gun.anon.Change
import typingsJapgolly.gun.anon.Decrypt
import typingsJapgolly.gun.anon.Err
import typingsJapgolly.gun.anon.ErrString
import typingsJapgolly.gun.anon.Ify
import typingsJapgolly.gun.anon.Ok
import typingsJapgolly.gun.anon.Pub
import typingsJapgolly.gun.anon.Put
import typingsJapgolly.gun.anon.Recordgunrootidbackontagg
import typingsJapgolly.gun.anon.Recordofftonexttheonasbac
import typingsJapgolly.gun.anon.SessionStorage
import typingsJapgolly.gun.anon.Wait
import typingsJapgolly.gun.anon.`0`
import typingsJapgolly.gun.gunBooleans.`false`
import typingsJapgolly.gun.gunStrings.pre_root
import typingsJapgolly.gun.gunStrings.root
import typingsJapgolly.gun.mod.Gun.ChainReference
import typingsJapgolly.gun.mod.Gun.Constructor
import typingsJapgolly.gun.mod.Gun.ConstructorOptions
import typingsJapgolly.std.Partial
import typingsJapgolly.std.PromiseLike
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("gun", JSImport.Namespace)
  @js.native
  open class ^[DataType] ()
    extends StObject
       with ChainReference[DataType, Any, pre_root] {
    def this(options: String) = this()
    def this(options: js.Array[String]) = this()
    def this(options: ConstructorOptions) = this()
  }
  @JSImport("gun", JSImport.Namespace)
  @js.native
  val ^ : js.Object & Constructor = js.native
  
  object Gun {
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      T extends object ? {[ key in keyof T ]: gun.gun.Gun.AlwaysDisallowedType<T[key]> extends never? never : gun.gun.Gun.AccessObject<T[key]>} : T
      }}}
      */
    @js.native
    trait AccessObject[T] extends StObject
    
    type AckCallback = js.Function1[/* ack */ Err | Ok, Unit]
    
    /** Gun does not accept Array value, so we need extract to make types correct */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      gun.gun.Gun.ArrayOf<T> extends never ? T : gun.gun.Gun.ArrayOf<T>
      }}}
      */
    @js.native
    trait AllowArray[T] extends StObject
    
    /** These types cannot be stored on Gun */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      T extends (args : ...any): void ? never : T extends {new (args : ...any): any} ? never : gun.gun.Gun.AccessObject<T>
      }}}
      */
    @js.native
    trait AlwaysDisallowedType[T] extends StObject
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      gun.gun.Gun.ArrayOf<DataType> extends never ? DataType : std.Record<string, any>
      }}}
      */
    @js.native
    trait ArrayAsRecord[DataType] extends StObject
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      T extends std.Array<infer U> ? U : never
      }}}
      */
    @js.native
    trait ArrayOf[T] extends StObject
    
    @js.native
    trait ChainReference[DataType, ReferenceKey, IsTop /* <: pre_root | root | `false` */] extends StObject {
      
      /**
        * Authenticates a user, previously created via User.create.
        * @param alias Username or Alias which can be used to find a user.
        * @param pass Passphrase for the user
        * @param cb Callback that is to be called upon authentication of the user.
        * @param opt Option Object containing options for authentiaction. (In gun options are added at end of syntax. opt is rarely used, hence is added at the end.)
        */
      def auth(alias: String, pass: String): ChainReference[Any, Any, `false`] = js.native
      def auth(alias: String, pass: String, cb: js.Function1[/* ack */ Ack | ErrString, Unit]): ChainReference[Any, Any, `false`] = js.native
      def auth(alias: String, pass: String, cb: js.Function1[/* ack */ Ack | ErrString, Unit], opt: js.Object): ChainReference[Any, Any, `false`] = js.native
      def auth(alias: String, pass: String, cb: Unit, opt: js.Object): ChainReference[Any, Any, `false`] = js.native
      
      /**
        * Move up to the parent context on the chain.
        *
        * Every time a new chain is created, a reference to the old context is kept to go back to.
        * @param amount The number of times you want to go back up the chain.
        * `-1` or `Infinity` will take you to the root.
        * @returns Impossible to determinate final type. You must cast it by yourself.
        */
      def back(): ChainReference[Any, Any, `false`] = js.native
      def back(amount: Double): ChainReference[Any, Any, `false`] = js.native
      
      /**
        * bye lets you change data after that browser peer disconnects.
        * This is useful for games and status messages,
        * that if a player leaves you can remove them from the game or set a user's status to "away".
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/bye.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/bye.js"></script>`!
        */
      var bye: js.UndefOr[js.Function0[Put[DataType]]] = js.native
      
      //#endregion
      //#region User
      /**
        * Creates a new user and calls callback upon completion.
        * @param alias Username or Alias which can be used to find a user.
        * @param pass Passphrase that will be extended with PBKDF2 to make it a secure way to login.
        * @param cb Callback that is to be called upon creation of the user.
        * @param opt Option Object containing options for creation. (In gun options are added at end of syntax. opt is rarely used, hence is added at the end.)
        */
      def create(alias: String, pass: String): ChainReference[Any, Any, `false`] = js.native
      def create(alias: String, pass: String, cb: js.Function1[/* ack */ Pub | ErrString, Unit]): ChainReference[Any, Any, `false`] = js.native
      def create(alias: String, pass: String, cb: js.Function1[/* ack */ Pub | ErrString, Unit], opt: js.Object): ChainReference[Any, Any, `false`] = js.native
      def create(alias: String, pass: String, cb: Unit, opt: js.Object): ChainReference[Any, Any, `false`] = js.native
      
      /**
        * Deletes a user from the current gun instance and propagates the delete to other peers.
        * @param alias Username or alias.
        * @param pass Passphrase for the user.
        * @param cb Callback that is called when the user was successfully deleted.
        */
      def delete(alias: String, pass: String): js.Promise[Unit] = js.native
      def delete(alias: String, pass: String, cb: js.Function1[/* ack */ `0`, Unit]): js.Promise[Unit] = js.native
      
      /**
        * Where to read data from.
        * @param key The key is the ID or property name of the data that you saved from earlier
        *  (or that will be saved later).
        * * Note that if you use .put at any depth after a get it first reads the data and then writes, merging the data as a partial update.
        * @param callback You will usually be using gun.on or gun.once to actually retrieve your data,
        * not this callback (it is intended for more low level control, for module and extensions).
        *
        * **Avoid use callback. The type in the document may be wrong.**
        *
        * **Here the type of callback respect to the actual behavior**
        */
      def get[K /* <: /* keyof DataType */ String */](
        key: /* import warning: importer.ImportType#apply Failed type conversion: gun.gun.Gun.ArrayOf<DataType> extends never ? K : never */ js.Any
      ): ChainReference[
            /* import warning: importer.ImportType#apply Failed type conversion: DataType[K] */ js.Any, 
            K, 
            /* import warning: importer.ImportType#apply Failed type conversion: IsTop extends 'pre_root' ? 'root' : false */ js.Any
          ] = js.native
      def get[K /* <: /* keyof DataType */ String */](
        key: /* import warning: importer.ImportType#apply Failed type conversion: gun.gun.Gun.ArrayOf<DataType> extends never ? K : never */ js.Any,
        callback: js.Function2[/* paramA */ Recordgunrootidbackontagg, /* paramB */ Recordofftonexttheonasbac, Unit]
      ): ChainReference[
            /* import warning: importer.ImportType#apply Failed type conversion: DataType[K] */ js.Any, 
            K, 
            /* import warning: importer.ImportType#apply Failed type conversion: IsTop extends 'pre_root' ? 'root' : false */ js.Any
          ] = js.native
      
      /**
        * Say you save some data, but want to do something with it later, like expire it or refresh it.
        * Well, then `later` is for you! You could use this to easily implement a TTL or similar behavior.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/later.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/later.js"></script>`!
        */
      var later: js.UndefOr[
            js.Function2[
              /* callback */ js.ThisFunction2[
                /* this */ ChainReference[DataType, ReferenceKey, `false`], 
                /* data */ ArrayAsRecord[DataType], 
                /* key */ ReferenceKey, 
                Unit
              ], 
              /* seconds */ Double, 
              ChainReference[DataType, ReferenceKey, `false`]
            ]
          ] = js.native
      
      /**
        * Log out currently authenticated user. Parameters are unused in the current implementation.
        * @param opt unused in current implementation.
        * @param cb unused in current implementation.
        */
      def leave(): ChainReference[Any, Any, `false`] = js.native
      def leave(opt: scala.Nothing): ChainReference[Any, Any, `false`] = js.native
      def leave(opt: scala.Nothing, cb: scala.Nothing): ChainReference[Any, Any, `false`] = js.native
      def leave(opt: Unit, cb: scala.Nothing): ChainReference[Any, Any, `false`] = js.native
      
      /**
        * Loads the full object once. It is the same as `open` but with the behavior of `once`.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/load.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/load.js"></script>`!
        */
      var load: js.UndefOr[
            js.Function1[
              /* callback */ js.Function1[/* data */ ArrayAsRecord[DataType], Unit], 
              ChainReference[DataType, ReferenceKey, `false`]
            ]
          ] = js.native
      
      /**
        * Map iterates over each property and item on a node, passing it down the chain,
        * behaving like a forEach on your data.
        * It also subscribes to every item as well and listens for newly inserted items.
        */
      def map(): ChainReference[ArrayOf[DataType], ReferenceKey, `false`] = js.native
      def map(
        callback: js.Function2[/* value */ ArrayOf[DataType], /* key */ DataType, js.UndefOr[ArrayOf[DataType]]]
      ): ChainReference[ArrayOf[DataType], ReferenceKey, `false`] = js.native
      
      /**
        * Handle cases where data can't be found.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/not.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/not.js"></script>`!
        */
      var not: js.UndefOr[
            js.Function1[
              /* callback */ js.Function1[/* key */ ReferenceKey, Unit], 
              ChainReference[DataType, ReferenceKey, `false`]
            ]
          ] = js.native
      
      /**
        * Undocumented, but extremely useful and mentioned in the document
        *
        * Remove **all** listener on this node.
        */
      def off(): Unit = js.native
      
      // Main API
      /**
        * Subscribe to updates and changes on a node or property in realtime.
        * @param option Currently, the only option is to filter out old data, and just be given the changes.
        * If you're listening to a node with 100 fields, and just one changes,
        * you'll instead be passed a node with a single property representing that change rather than the full node every time.
        * @param callback
        * Once initially and whenever the property or node you're focused on changes, this callback is immediately fired with the data as it is at that point in time.
        *
        * Since gun streams data, the callback will probably be called multiple times as new chunk comes in.
        * To remove a listener call .off() on the same property or node.
        */
      def on(
        callback: js.Function2[
              /* data */ DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]], 
              /* key */ ReferenceKey, 
              Unit
            ]
      ): ChainReference[DataType, ReferenceKey, `false`] = js.native
      def on(
        callback: js.Function2[
              /* data */ DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]], 
              /* key */ ReferenceKey, 
              Unit
            ],
        option: Boolean
      ): ChainReference[DataType, ReferenceKey, `false`] = js.native
      def on(
        callback: js.Function2[
              /* data */ DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]], 
              /* key */ ReferenceKey, 
              Unit
            ],
        option: Change
      ): ChainReference[DataType, ReferenceKey, `false`] = js.native
      
      /**
        * Get the current data without subscribing to updates. Or `undefined` if it cannot be found.
        * @returns In the document, it said the return value may change in the future. Don't rely on it.
        */
      def once(): ChainReference[DataType, ReferenceKey, `false`] = js.native
      def once(
        callback: js.Function2[
              /* data */ js.UndefOr[DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]]], 
              /* key */ ReferenceKey, 
              Unit
            ]
      ): ChainReference[DataType, ReferenceKey, `false`] = js.native
      def once(
        callback: js.Function2[
              /* data */ js.UndefOr[DisallowPrimitives[IsTop, AlwaysDisallowedType[ArrayAsRecord[DataType]]]], 
              /* key */ ReferenceKey, 
              Unit
            ],
        option: Wait
      ): ChainReference[DataType, ReferenceKey, `false`] = js.native
      def once(callback: Unit, option: Wait): ChainReference[DataType, ReferenceKey, `false`] = js.native
      
      /**
        * Open behaves very similarly to gun.on, except it gives you the **full depth of a document** on every update.
        * It also works with graphs, tables, or other data structures. Think of it as opening up a live connection to a document.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/open.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/open.js"></script>`!
        */
      var open: js.UndefOr[
            js.Function1[
              /* callback */ js.Function1[/* data */ ArrayAsRecord[DataType], Unit], 
              ChainReference[DataType, ReferenceKey, `false`]
            ]
          ] = js.native
      
      /**
        * Change the configuration of the gun database instance.
        * @param options The options argument is the same object you pass to the constructor.
        *
        * The options's properties replace those in the instance's configuration but options.peers are **added** to peers known to the gun instance.
        * @returns No mention in the document, behavior as `ChainReference<DataType, ReferenceKey>`
        */
      def opt(options: ConstructorOptions): ChainReference[DataType, ReferenceKey, `false`] = js.native
      
      /**
        * Returns the key pair in the form of an object as below.
        */
      def pair(): CryptoKeyPair = js.native
      
      //#endregion
      //#region Extended API
      /**
        *
        * Path does the same thing as `.get` but has some conveniences built in.
        * @deprecated This is not friendly with type system.
        *
        * **Warning**: This extension was removed from core, you probably shouldn't be using it!
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/path.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/path.js"></script>`!
        */
      var path: js.UndefOr[
            js.Function1[/* path */ String | js.Array[String], ChainReference[Any, Any, `false`]]
          ] = js.native
      
      /**
        * Returns a promise for you to use.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/then.js')` or
        *  `<script src="https://cdn.jsdelivr.net/npm/gun/lib/then.js"></script>`!
        */
      var promise: js.UndefOr[
            js.Function1[
              /* onfulfilled */ js.UndefOr[
                js.Function1[
                  /* value */ typingsJapgolly.gun.anon.Gun[DataType, ReferenceKey], 
                  (typingsJapgolly.gun.anon.Gun[DataType, ReferenceKey]) | (PromiseLike[typingsJapgolly.gun.anon.Gun[DataType, ReferenceKey]])
                ]
              ], 
              js.Promise[typingsJapgolly.gun.anon.Gun[DataType, ReferenceKey]]
            ]
          ] = js.native
      
      //#region API
      /**
        * Save data into gun, syncing it with your connected peers.
        *
        * * You cannot save primitive values at the root level.
        *
        * @param data You do not need to re-save the entire object every time,
        * gun will automatically merge your data into what already exists as a "partial" update.
        *
        * * `undefined`, `NaN`, `Infinity`, `array`, will be rejected.
        * * Traditional arrays are dangerous in real-time apps. Use `gun.set` instead.
        *
        * @param callback invoked on each acknowledgment
        */
      def put(data: Partial[AlwaysDisallowedType[DisallowPrimitives[IsTop, DisallowArray[DataType]]]]): ChainReference[DataType, ReferenceKey, IsTop] = js.native
      def put(
        data: Partial[AlwaysDisallowedType[DisallowPrimitives[IsTop, DisallowArray[DataType]]]],
        callback: AckCallback
      ): ChainReference[DataType, ReferenceKey, IsTop] = js.native
      
      /**
        * Recall saves a users credentials in sessionStorage of the browser. As long as the tab of your app is not closed the user stays logged in, even through page refreshes and reloads.
        * @param opt option object If you want to use browser sessionStorage to allow users to stay logged in as long as the session is open, set opt.sessionStorage to true
        * @param cb internally the callback is passed on to the user.auth function to logged the user back in. Refer to user.auth for callback documentation.
        */
      def recall(): ChainReference[Any, Any, `false`] = js.native
      def recall(
        opt: Unit,
        cb: /* import warning: importer.ImportType#apply Failed type conversion: gun.gun.Gun.Parameters<(alias : string, pass : string, cb : (ack : gun.anon.Ack | gun.anon.ErrString): void | undefined, opt : {} | undefined): gun.gun.Gun.ChainReference<any, any, false>>[2] */ js.Any
      ): ChainReference[Any, Any, `false`] = js.native
      def recall(opt: SessionStorage): ChainReference[Any, Any, `false`] = js.native
      def recall(
        opt: SessionStorage,
        cb: /* import warning: importer.ImportType#apply Failed type conversion: gun.gun.Gun.Parameters<(alias : string, pass : string, cb : (ack : gun.anon.Ack | gun.anon.ErrString): void | undefined, opt : {} | undefined): gun.gun.Gun.ChainReference<any, any, false>>[2] */ js.Any
      ): ChainReference[Any, Any, `false`] = js.native
      
      /**
        * **.set does not means 'set data', it means a Mathematical Set**
        *
        * Add a unique item to an unordered list.
        * `gun.set` works like a mathematical set, where each item in the list is unique.
        * If the item is added twice, it will be merged.
        *
        * **This means only objects, for now, are supported.**
        */
      def set(
        data: AlwaysDisallowedType[
              /* import warning: importer.ImportType#apply Failed type conversion: DataType extends std.Array<infer U> ? U extends {[key: string] : any, [key: number] : any} ? gun.gun.Gun.ArrayOf<DataType> : never : never */ js.Any
            ]
      ): ChainReference[ArrayOf[DataType], Any, `false`] = js.native
      def set(
        data: AlwaysDisallowedType[
              /* import warning: importer.ImportType#apply Failed type conversion: DataType extends std.Array<infer U> ? U extends {[key: string] : any, [key: number] : any} ? gun.gun.Gun.ArrayOf<DataType> : never : never */ js.Any
            ],
        callback: AckCallback
      ): ChainReference[ArrayOf[DataType], Any, `false`] = js.native
      
      /**
        * Returns a promise for you to use.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/then.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/then.js"></script>`!
        */
      var `then`: js.UndefOr[
            js.Function1[
              /* onfulfilled */ js.UndefOr[
                js.Function1[
                  /* value */ ArrayAsRecord[DataType], 
                  ArrayAsRecord[DataType] | PromiseLike[ArrayAsRecord[DataType]]
                ]
              ], 
              js.Promise[ArrayAsRecord[DataType]]
            ]
          ] = js.native
      
      /**
        * Subscribes to all future events that occur on the Timegraph and retrieve a specified number of old events
        *
        * **Warning**: The Timegraph extension isn't required by default, you would need to include at "gun/lib/time.js"
        */
      /** Pushes data to a Timegraph with it's time set to Gun.state()'s time */
      var time: (js.UndefOr[
            js.Function2[
              /* callback */ js.Function3[/* data */ ArrayOf[DataType], /* key */ ReferenceKey, /* time */ Double, Unit], 
              /* alsoReceiveNOldEvents */ js.UndefOr[Double], 
              ChainReference[DataType, ReferenceKey, `false`]
            ]
          ]) & (js.UndefOr[js.Function1[/* data */ ArrayOf[DataType], Unit]]) = js.native
      
      /**
        * After you save some data in an unordered list, you may need to remove it.
        *
        * **Warning**: Not included by default! You must include it yourself via `require('gun/lib/unset.js')` or
        * `<script src="https://cdn.jsdelivr.net/npm/gun/lib/unset.js"></script>`!
        */
      var unset: js.UndefOr[
            js.Function1[/* data */ ArrayOf[DataType], ChainReference[DataType, ReferenceKey, `false`]]
          ] = js.native
      
      /**
        * @param publicKey If you know a users publicKey you can get their user graph and see any unencrypted data they may have stored there.
        */
      def user(): ChainReference[Any, Any, `false`] = js.native
      def user(publicKey: String): ChainReference[Any, Any, `false`] = js.native
    }
    
    @js.native
    trait Constructor
      extends StObject
         with Instantiable0[ChainReference[js.Object, Any, pre_root]]
         with Instantiable1[
              (/* options */ js.Array[String]) | (/* options */ ConstructorOptions) | (/* options */ String), 
              ChainReference[js.Object, Any, pre_root]
            ] {
      
      /**
        * @description
        * no parameters creates a local datastore using the default persistence layer, either localStorage or Radisk.
        * @param options
        * passing a URL creates the above local datastore that also tries to sync with the URL.
        *
        * or you can pass in an array of URLs to sync with multiple peers.
        */
      def apply[DataType](): ChainReference[DataType, Any, pre_root] = js.native
      def apply[DataType](options: String): ChainReference[DataType, Any, pre_root] = js.native
      def apply[DataType](options: js.Array[String]): ChainReference[DataType, Any, pre_root] = js.native
      def apply[DataType](options: ConstructorOptions): ChainReference[DataType, Any, pre_root] = js.native
      
      /** @see https://gun.eco/docs/SEA */
      var SEA: Decrypt = js.native
      
      var node: Ify = js.native
    }
    
    /**
      * options['module name'] allows you to pass options to a 3rd party module.
      * Their project README will likely list the exposed options
      * https://github.com/amark/gun/wiki/Modules
      */
    /* Inlined std.Partial<{  file :string,   web :any,   s3 :{  key :any,   secret :any,   bucket :any},   peers :std.Record<string, {}>,   radisk :boolean,   localStorage :boolean, uuid (): string, [key: string] : any}> */
    trait ConstructorOptions extends StObject {
      
      var file: js.UndefOr[String] = js.undefined
      
      var localStorage: js.UndefOr[Boolean] = js.undefined
      
      var peers: js.UndefOr[Record[String, js.Object]] = js.undefined
      
      var radisk: js.UndefOr[Boolean] = js.undefined
      
      var s3: js.UndefOr[Bucket] = js.undefined
      
      var uuid: js.UndefOr[js.Function0[String]] = js.undefined
      
      var web: js.UndefOr[Any] = js.undefined
    }
    object ConstructorOptions {
      
      inline def apply(): ConstructorOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConstructorOptions]
      }
      
      extension [Self <: ConstructorOptions](x: Self) {
        
        inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
        
        inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
        
        inline def setLocalStorage(value: Boolean): Self = StObject.set(x, "localStorage", value.asInstanceOf[js.Any])
        
        inline def setLocalStorageUndefined: Self = StObject.set(x, "localStorage", js.undefined)
        
        inline def setPeers(value: Record[String, js.Object]): Self = StObject.set(x, "peers", value.asInstanceOf[js.Any])
        
        inline def setPeersUndefined: Self = StObject.set(x, "peers", js.undefined)
        
        inline def setRadisk(value: Boolean): Self = StObject.set(x, "radisk", value.asInstanceOf[js.Any])
        
        inline def setRadiskUndefined: Self = StObject.set(x, "radisk", js.undefined)
        
        inline def setS3(value: Bucket): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
        
        inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
        
        inline def setUuid(value: CallbackTo[String]): Self = StObject.set(x, "uuid", value.toJsFn)
        
        inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
        
        inline def setWeb(value: Any): Self = StObject.set(x, "web", value.asInstanceOf[js.Any])
        
        inline def setWebUndefined: Self = StObject.set(x, "web", js.undefined)
      }
    }
    
    /* Inlined std.Record<'pub' | 'priv' | 'epub' | 'epriv', string> */
    trait CryptoKeyPair extends StObject {
      
      var epriv: String
      
      var epub: String
      
      var priv: String
      
      var pub: String
    }
    object CryptoKeyPair {
      
      inline def apply(epriv: String, epub: String, priv: String, pub: String): CryptoKeyPair = {
        val __obj = js.Dynamic.literal(epriv = epriv.asInstanceOf[js.Any], epub = epub.asInstanceOf[js.Any], priv = priv.asInstanceOf[js.Any], pub = pub.asInstanceOf[js.Any])
        __obj.asInstanceOf[CryptoKeyPair]
      }
      
      extension [Self <: CryptoKeyPair](x: Self) {
        
        inline def setEpriv(value: String): Self = StObject.set(x, "epriv", value.asInstanceOf[js.Any])
        
        inline def setEpub(value: String): Self = StObject.set(x, "epub", value.asInstanceOf[js.Any])
        
        inline def setPriv(value: String): Self = StObject.set(x, "priv", value.asInstanceOf[js.Any])
        
        inline def setPub(value: String): Self = StObject.set(x, "pub", value.asInstanceOf[js.Any])
      }
    }
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      gun.gun.Gun.ArrayOf<T> extends never ? T : never
      }}}
      */
    @js.native
    trait DisallowArray[T] extends StObject
    
    /** These types cannot be stored on Gun's root level */
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      Open extends false ? T : T extends string ? never : T extends number ? never : T extends boolean ? never : T extends null ? never : T extends undefined ? never : T
      }}}
      */
    @js.native
    trait DisallowPrimitives[Open, T] extends StObject
    
    /** NOTE: Conditional type definitions are impossible to translate to Scala.
      * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
      * You'll have to cast your way around this structure, unfortunately. 
      * TS definition: {{{
      T extends (args : infer P): any ? P : never
      }}}
      */
    @js.native
    trait Parameters[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
    
    type Saveable[DataType] = Partial[DataType] | String | Double | Boolean | Null | (ChainReference[DataType, Any, `false`])
  }
  
  type _To = js.Object & Constructor
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & Constructor = ^
}
