package typingsJapgolly.pgCopyStreams

import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import typingsJapgolly.pg.mod.Connection
import typingsJapgolly.pg.mod.Submittable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("pg-copy-streams", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("pg-copy-streams", "CopyStreamQuery")
  @js.native
  open class CopyStreamQuery ()
    extends Transform
       with Submittable {
    def this(opts: TransformOptions) = this()
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  @JSImport("pg-copy-streams", "CopyToStreamQuery")
  @js.native
  open class CopyToStreamQuery ()
    extends Transform
       with Submittable {
    def this(opts: TransformOptions) = this()
    
    /* CompleteClass */
    override def submit(connection: Connection): Unit = js.native
  }
  
  inline def from(txt: String): CopyStreamQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(txt.asInstanceOf[js.Any]).asInstanceOf[CopyStreamQuery]
  inline def from(txt: String, options: TransformOptions): CopyStreamQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CopyStreamQuery]
  
  inline def to(txt: String): CopyToStreamQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("to")(txt.asInstanceOf[js.Any]).asInstanceOf[CopyToStreamQuery]
  inline def to(txt: String, options: TransformOptions): CopyToStreamQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("to")(txt.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CopyToStreamQuery]
}
