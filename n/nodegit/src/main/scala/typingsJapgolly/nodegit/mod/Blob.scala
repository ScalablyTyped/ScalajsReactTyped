package typingsJapgolly.nodegit.mod

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Blob")
@js.native
open class Blob ()
  extends typingsJapgolly.nodegit.blobMod.Blob
/* static members */
object Blob {
  
  @JSImport("nodegit", "Blob")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param repo - repository where to blob will be written
    * @param buffer - data to be written into the blob
    * @param len - length of the data
    * @returns - return the id of the written blob
    */
  inline def createFromBuffer(repo: typingsJapgolly.nodegit.repositoryMod.Repository, buffer: Buffer, len: Double): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromBuffer")(repo.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  /**
    * @param repo - repository where the blob will be written. this repository can be bare or not
    * @param path - file from which the blob will be created
    */
  inline def createFromDisk(repo: typingsJapgolly.nodegit.repositoryMod.Repository, path: String): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromDisk")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  inline def createFromStream(repo: typingsJapgolly.nodegit.repositoryMod.Repository, hintPath: String): js.Promise[WriteStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(repo.asInstanceOf[js.Any], hintPath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WriteStream]]
  
  /**
    * @param repo - repository where the blob will be written. this repository cannot be bare
    * @param relativePath - file from which the blob will be created, relative to the repository's working dir
    * @returns - 0 or an error code
    */
  inline def createFromWorkdir(repo: typingsJapgolly.nodegit.repositoryMod.Repository, relativePath: String): js.Promise[typingsJapgolly.nodegit.oidMod.Oid] = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromWorkdir")(repo.asInstanceOf[js.Any], relativePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.oidMod.Oid]]
  
  inline def filteredContent(blob: typingsJapgolly.nodegit.blobMod.Blob, as_path: String, check_for_binary_data: Double): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("filteredContent")(blob.asInstanceOf[js.Any], as_path.asInstanceOf[js.Any], check_for_binary_data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: String): js.Promise[typingsJapgolly.nodegit.blobMod.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.blobMod.Blob]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.blobMod.Blob): js.Promise[typingsJapgolly.nodegit.blobMod.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.blobMod.Blob]]
  inline def lookup(repo: typingsJapgolly.nodegit.repositoryMod.Repository, id: typingsJapgolly.nodegit.oidMod.Oid): js.Promise[typingsJapgolly.nodegit.blobMod.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookup")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.blobMod.Blob]]
  
  inline def lookupPrefix(
    repo: typingsJapgolly.nodegit.repositoryMod.Repository,
    id: typingsJapgolly.nodegit.oidMod.Oid,
    len: Double
  ): js.Promise[typingsJapgolly.nodegit.blobMod.Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("lookupPrefix")(repo.asInstanceOf[js.Any], id.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.blobMod.Blob]]
}
