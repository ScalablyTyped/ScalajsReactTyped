package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IAutomaticMetadataResult
import typingsJapgolly.mfiles.IIDs
import typingsJapgolly.mfiles.IObjVer
import typingsJapgolly.mfiles.IVaultAutomaticMetadataOperations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.VaultAutomaticMetadataOperations")
@js.native
open class VaultAutomaticMetadataOperations ()
  extends StObject
     with IVaultAutomaticMetadataOperations {
  
  /* CompleteClass */
  override def GetAutomaticMetadataForObject(ObjVer: IObjVer): IAutomaticMetadataResult = js.native
  
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFile(UploadSessionID: Double): IAutomaticMetadataResult = js.native
  
  /* CompleteClass */
  override def GetAutomaticMetadataForTemporaryFiles(IIDs: IIDs): IAutomaticMetadataResult = js.native
}
