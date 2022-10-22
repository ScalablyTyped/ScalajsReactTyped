package typingsJapgolly.globPromise

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.glob.anon.IsDirectory
import typingsJapgolly.glob.globBooleans.`false`
import typingsJapgolly.glob.globStrings.DIR
import typingsJapgolly.glob.globStrings.FILE
import typingsJapgolly.glob.mod.IGlob
import typingsJapgolly.glob.mod.IGlobStatic
import typingsJapgolly.glob.mod.IOptions
import typingsJapgolly.minimatch.mod.IMinimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("glob-promise", JSImport.Namespace)
  @js.native
  val ^ : Export = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("glob-promise", "Glob")
  @js.native
  open class Glob protected ()
    extends StObject
       with IGlob {
    def this(pattern: String) = this()
    def this(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]) = this()
    def this(pattern: String, options: IOptions) = this()
    def this(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
    ) = this()
    
    /* CompleteClass */
    var aborted: Boolean = js.native
    
    /* CompleteClass */
    var cache: StringDictionary[Boolean | DIR | FILE | js.Array[String]] = js.native
    
    /* CompleteClass */
    var found: js.Array[String] = js.native
    
    /* CompleteClass */
    var minimatch: IMinimatch = js.native
    
    /* CompleteClass */
    var options: IOptions = js.native
    
    /* CompleteClass */
    var realpathCache: StringDictionary[String] = js.native
    
    /* CompleteClass */
    var statCache: StringDictionary[js.UndefOr[`false` | IsDirectory]] = js.native
    
    /* CompleteClass */
    var symlinks: StringDictionary[js.UndefOr[Boolean]] = js.native
  }
  
  @js.native
  trait Export extends GlobPromise {
    
    val Glob: IGlobStatic = js.native
    
    def glob(pattern: String, cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]): IGlob = js.native
    def glob(
      pattern: String,
      options: IOptions,
      cb: js.Function2[/* err */ js.Error | Null, /* matches */ js.Array[String], Unit]
    ): IGlob = js.native
    
    def hasMagic(pattern: String): Boolean = js.native
    def hasMagic(pattern: String, options: IOptions): Boolean = js.native
    
    def promise(pattern: String): js.Promise[js.Array[String]] = js.native
    def promise(pattern: String, options: IOptions): js.Promise[js.Array[String]] = js.native
    
    def sync(pattern: String): js.Array[String] = js.native
    def sync(pattern: String, options: IOptions): js.Array[String] = js.native
  }
  
  type GlobPromise = js.Function2[
    /* pattern */ String, 
    /* options */ js.UndefOr[IOptions], 
    js.Promise[js.Array[String]]
  ]
  
  type _To = Export
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Export = ^
}
