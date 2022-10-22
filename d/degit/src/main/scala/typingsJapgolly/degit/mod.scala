package typingsJapgolly.degit

import typingsJapgolly.degit.degitStrings.clone
import typingsJapgolly.degit.degitStrings.info
import typingsJapgolly.degit.degitStrings.remove
import typingsJapgolly.degit.degitStrings.warn
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(src: String): Degit = ^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any]).asInstanceOf[Degit]
  inline def apply(src: String, opts: Options): Degit = (^.asInstanceOf[js.Dynamic].apply(src.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Degit]
  
  @JSImport("degit", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Action extends StObject {
    
    var action: String
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Action {
    
    inline def apply(action: String): Action = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
      __obj.asInstanceOf[Action]
    }
    
    extension [Self <: Action](x: Self) {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  @js.native
  trait Degit extends EventEmitter {
    
    /**
      * @async
      */
    def clone(dest: String): js.Promise[Unit] = js.native
    
    def on(event: info | warn, callback: js.Function1[/* info */ Info, Unit]): this.type = js.native
    
    /**
      * @async
      */
    def remove(dir: String, dest: String, action: RemoveAction): js.Promise[Unit] = js.native
  }
  
  trait DegitAction
    extends StObject
       with Action {
    
    @JSName("action")
    var action_DegitAction: clone
    
    var src: String
  }
  object DegitAction {
    
    inline def apply(src: String): DegitAction = {
      val __obj = js.Dynamic.literal(action = "clone", src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[DegitAction]
    }
    
    extension [Self <: DegitAction](x: Self) {
      
      inline def setAction(value: clone): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.degit.degitStrings.DEST_NOT_EMPTY
    - typingsJapgolly.degit.degitStrings.MISSING_REF
    - typingsJapgolly.degit.degitStrings.COULD_NOT_DOWNLOAD
    - typingsJapgolly.degit.degitStrings.BAD_SRC
    - typingsJapgolly.degit.degitStrings.UNSUPPORTED_HOST
    - typingsJapgolly.degit.degitStrings.BAD_REF
    - typingsJapgolly.degit.degitStrings.COULD_NOT_FETCH
  */
  trait DegitErrorCode extends StObject
  object DegitErrorCode {
    
    inline def BAD_REF: typingsJapgolly.degit.degitStrings.BAD_REF = "BAD_REF".asInstanceOf[typingsJapgolly.degit.degitStrings.BAD_REF]
    
    inline def BAD_SRC: typingsJapgolly.degit.degitStrings.BAD_SRC = "BAD_SRC".asInstanceOf[typingsJapgolly.degit.degitStrings.BAD_SRC]
    
    inline def COULD_NOT_DOWNLOAD: typingsJapgolly.degit.degitStrings.COULD_NOT_DOWNLOAD = "COULD_NOT_DOWNLOAD".asInstanceOf[typingsJapgolly.degit.degitStrings.COULD_NOT_DOWNLOAD]
    
    inline def COULD_NOT_FETCH: typingsJapgolly.degit.degitStrings.COULD_NOT_FETCH = "COULD_NOT_FETCH".asInstanceOf[typingsJapgolly.degit.degitStrings.COULD_NOT_FETCH]
    
    inline def DEST_NOT_EMPTY: typingsJapgolly.degit.degitStrings.DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[typingsJapgolly.degit.degitStrings.DEST_NOT_EMPTY]
    
    inline def MISSING_REF: typingsJapgolly.degit.degitStrings.MISSING_REF = "MISSING_REF".asInstanceOf[typingsJapgolly.degit.degitStrings.MISSING_REF]
    
    inline def UNSUPPORTED_HOST: typingsJapgolly.degit.degitStrings.UNSUPPORTED_HOST = "UNSUPPORTED_HOST".asInstanceOf[typingsJapgolly.degit.degitStrings.UNSUPPORTED_HOST]
  }
  
  trait Info extends StObject {
    
    val code: String
    
    val dest: String
    
    val message: String
    
    val repo: Degit
  }
  object Info {
    
    inline def apply(code: String, dest: String, message: String, repo: Degit): Info = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Info]
    }
    
    extension [Self <: Info](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setRepo(value: Degit): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.degit.degitStrings.SUCCESS
    - typingsJapgolly.degit.degitStrings.FILE_DOES_NOT_EXIST
    - typingsJapgolly.degit.degitStrings.REMOVED
    - typingsJapgolly.degit.degitStrings.DEST_NOT_EMPTY
    - typingsJapgolly.degit.degitStrings.DEST_IS_EMPTY
    - typingsJapgolly.degit.degitStrings.USING_CACHE
    - typingsJapgolly.degit.degitStrings.FOUND_MATCH
    - typingsJapgolly.degit.degitStrings.FILE_EXISTS
    - typingsJapgolly.degit.degitStrings.PROXY
    - typingsJapgolly.degit.degitStrings.DOWNLOADING
    - typingsJapgolly.degit.degitStrings.EXTRACTING
  */
  trait InfoCode extends StObject
  object InfoCode {
    
    inline def DEST_IS_EMPTY: typingsJapgolly.degit.degitStrings.DEST_IS_EMPTY = "DEST_IS_EMPTY".asInstanceOf[typingsJapgolly.degit.degitStrings.DEST_IS_EMPTY]
    
    inline def DEST_NOT_EMPTY: typingsJapgolly.degit.degitStrings.DEST_NOT_EMPTY = "DEST_NOT_EMPTY".asInstanceOf[typingsJapgolly.degit.degitStrings.DEST_NOT_EMPTY]
    
    inline def DOWNLOADING: typingsJapgolly.degit.degitStrings.DOWNLOADING = "DOWNLOADING".asInstanceOf[typingsJapgolly.degit.degitStrings.DOWNLOADING]
    
    inline def EXTRACTING: typingsJapgolly.degit.degitStrings.EXTRACTING = "EXTRACTING".asInstanceOf[typingsJapgolly.degit.degitStrings.EXTRACTING]
    
    inline def FILE_DOES_NOT_EXIST: typingsJapgolly.degit.degitStrings.FILE_DOES_NOT_EXIST = "FILE_DOES_NOT_EXIST".asInstanceOf[typingsJapgolly.degit.degitStrings.FILE_DOES_NOT_EXIST]
    
    inline def FILE_EXISTS: typingsJapgolly.degit.degitStrings.FILE_EXISTS = "FILE_EXISTS".asInstanceOf[typingsJapgolly.degit.degitStrings.FILE_EXISTS]
    
    inline def FOUND_MATCH: typingsJapgolly.degit.degitStrings.FOUND_MATCH = "FOUND_MATCH".asInstanceOf[typingsJapgolly.degit.degitStrings.FOUND_MATCH]
    
    inline def PROXY: typingsJapgolly.degit.degitStrings.PROXY = "PROXY".asInstanceOf[typingsJapgolly.degit.degitStrings.PROXY]
    
    inline def REMOVED: typingsJapgolly.degit.degitStrings.REMOVED = "REMOVED".asInstanceOf[typingsJapgolly.degit.degitStrings.REMOVED]
    
    inline def SUCCESS: typingsJapgolly.degit.degitStrings.SUCCESS = "SUCCESS".asInstanceOf[typingsJapgolly.degit.degitStrings.SUCCESS]
    
    inline def USING_CACHE: typingsJapgolly.degit.degitStrings.USING_CACHE = "USING_CACHE".asInstanceOf[typingsJapgolly.degit.degitStrings.USING_CACHE]
  }
  
  trait Options extends StObject {
    
    /**
      * @default false
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default undefined
      */
    var mode: js.UndefOr[ValidModes] = js.undefined
    
    /**
      * @default false
      */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setMode(value: ValidModes): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait RemoveAction
    extends StObject
       with Action {
    
    @JSName("action")
    var action_RemoveAction: remove
    
    var files: js.Array[String]
  }
  object RemoveAction {
    
    inline def apply(files: js.Array[String]): RemoveAction = {
      val __obj = js.Dynamic.literal(action = "remove", files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAction]
    }
    
    extension [Self <: RemoveAction](x: Self) {
      
      inline def setAction(value: remove): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setFiles(value: js.Array[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesVarargs(value: String*): Self = StObject.set(x, "files", js.Array(value*))
    }
  }
  
  // varia
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.degit.degitStrings.tar
    - typingsJapgolly.degit.degitStrings.git
  */
  trait ValidModes extends StObject
  object ValidModes {
    
    inline def git: typingsJapgolly.degit.degitStrings.git = "git".asInstanceOf[typingsJapgolly.degit.degitStrings.git]
    
    inline def tar: typingsJapgolly.degit.degitStrings.tar = "tar".asInstanceOf[typingsJapgolly.degit.degitStrings.tar]
  }
}
