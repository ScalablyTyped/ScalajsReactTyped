package typingsJapgolly.yeomanGenerator

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ejs.mod.Data
import typingsJapgolly.ejs.mod.Options
import typingsJapgolly.jsonSchema.mod.JSONSchema7Type
import typingsJapgolly.memFsEditor.mod.CopyOptions
import typingsJapgolly.memFsEditor.mod.FilePaths
import typingsJapgolly.memFsEditor.mod.ReadRawContents
import typingsJapgolly.memFsEditor.mod.ReadRawOptions
import typingsJapgolly.memFsEditor.mod.ReadStringOptions
import typingsJapgolly.memFsEditor.mod.WithGlobOptions
import typingsJapgolly.memFsEditor.mod.WriteJsonReplacer
import typingsJapgolly.memFsEditor.mod.WriteJsonSpace
import typingsJapgolly.yeomanGenerator.libUtilStorageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Email extends StObject {
    
    /**
      * Retrieves user's email from Git in the global scope or the project scope
      * (it'll take what Git will use in the current context)
      * @return configured git email or undefined
      */
    def email(): String
    
    /**
      * Retrieves user's name from Git in the global scope or the project scope
      * (it'll take what Git will use in the current context)
      * @return configured git name or undefined
      */
    def name(): String
  }
  object Email {
    
    inline def apply(email: CallbackTo[String], name: CallbackTo[String]): Email = {
      val __obj = js.Dynamic.literal(email = email.toJsFn, name = name.toJsFn)
      __obj.asInstanceOf[Email]
    }
    
    extension [Self <: Email](x: Self) {
      
      inline def setEmail(value: CallbackTo[String]): Self = StObject.set(x, "email", value.toJsFn)
      
      inline def setName(value: CallbackTo[String]): Self = StObject.set(x, "name", value.toJsFn)
    }
  }
  
  trait ExportOption extends StObject {
    
    /**
      * A value indicating whether an option should be exported for this question.
      */
    var exportOption: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * The storage to store the answers.
      */
    var storage: js.UndefOr[^] = js.undefined
  }
  object ExportOption {
    
    inline def apply(): ExportOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportOption]
    }
    
    extension [Self <: ExportOption](x: Self) {
      
      inline def setExportOption(value: Boolean | js.Object): Self = StObject.set(x, "exportOption", value.asInstanceOf[js.Any])
      
      inline def setExportOptionUndefined: Self = StObject.set(x, "exportOption", js.undefined)
      
      inline def setStorage(value: ^): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(filepath: String): String = js.native
    def apply(filepath: String, options: ReadRawOptions): ReadRawContents = js.native
    def apply(filepath: String, options: ReadStringOptions): String = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(from: FilePaths, to: String): Unit = js.native
    def apply(from: FilePaths, to: String, options: Unit, context: Unit, templateOptions: Options): Unit = js.native
    def apply(from: FilePaths, to: String, options: Unit, context: Data): Unit = js.native
    def apply(from: FilePaths, to: String, options: Unit, context: Data, templateOptions: Options): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Unit, templateOptions: Options): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
  }
  
  @js.native
  trait FnCallFilepathContentsReplacerSpace extends StObject {
    
    def apply(filepath: String, contents: Any): String = js.native
    def apply(filepath: String, contents: Any, replacer: Unit, space: WriteJsonSpace): String = js.native
    def apply(filepath: String, contents: Any, replacer: WriteJsonReplacer): String = js.native
    def apply(filepath: String, contents: Any, replacer: WriteJsonReplacer, space: WriteJsonSpace): String = js.native
  }
  
  @js.native
  trait FnCallFilepathDefaults extends StObject {
    
    def apply(filepath: String): js.UndefOr[JSONSchema7Type] = js.native
    def apply(filepath: String, defaults: JSONSchema7Type): JSONSchema7Type = js.native
  }
  
  @js.native
  trait FnCallFilepathOptions extends StObject {
    
    def apply(filepath: FilePaths): Unit = js.native
    def apply(filepath: FilePaths, options: WithGlobOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallFromToOptions extends StObject {
    
    def apply(from: FilePaths, to: String): Unit = js.native
    def apply(from: FilePaths, to: String, options: WithGlobOptions): Unit = js.native
  }
  
  trait Git extends StObject {
    
    val git: Email
    
    val github: Username
  }
  object Git {
    
    inline def apply(git: Email, github: Username): Git = {
      val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
      __obj.asInstanceOf[Git]
    }
    
    extension [Self <: Git](x: Self) {
      
      inline def setGit(value: Email): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGithub(value: Username): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store extends StObject {
    
    /**
      * A value indicating whether to store the user's previous answer.
      */
    var store: js.UndefOr[Boolean] = js.undefined
  }
  object Store {
    
    inline def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    extension [Self <: Store](x: Self) {
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait Username extends StObject {
    
    /**
      * Retrieves GitHub's username from the GitHub API
      * @return Resolved with the GitHub username or rejected if unable to
      *         get the information
      */
    def username(): js.Promise[String]
  }
  object Username {
    
    inline def apply(username: CallbackTo[js.Promise[String]]): Username = {
      val __obj = js.Dynamic.literal(username = username.toJsFn)
      __obj.asInstanceOf[Username]
    }
    
    extension [Self <: Username](x: Self) {
      
      inline def setUsername(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "username", value.toJsFn)
    }
  }
}
