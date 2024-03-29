package typingsJapgolly.vscode.mod

import typingsJapgolly.vscode.anon.Contents
import typingsJapgolly.vscode.anon.IgnoreIfExists
import typingsJapgolly.vscode.anon.IgnoreIfNotExists
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "WorkspaceEdit")
@js.native
open class WorkspaceEdit () extends StObject {
  
  /**
    * Create a regular file.
    *
    * @param uri Uri of the new file.
    * @param options Defines if an existing file should be overwritten or be
    * ignored. When `overwrite` and `ignoreIfExists` are both set `overwrite` wins.
    * When both are unset and when the file already exists then the edit cannot
    * be applied successfully. The `content`-property allows to set the initial contents
    * the file is being created with.
    * @param metadata Optional metadata for the entry.
    */
  def createFile(uri: Uri): Unit = js.native
  def createFile(uri: Uri, options: Unit, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  def createFile(uri: Uri, options: Contents): Unit = js.native
  def createFile(uri: Uri, options: Contents, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  
  /**
    * Delete the text at the given range.
    *
    * @param uri A resource identifier.
    * @param range A range.
    * @param metadata Optional metadata for the entry.
    */
  def delete(uri: Uri, range: Range): Unit = js.native
  def delete(uri: Uri, range: Range, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  
  /**
    * Delete a file or folder.
    *
    * @param uri The uri of the file that is to be deleted.
    * @param metadata Optional metadata for the entry.
    */
  def deleteFile(uri: Uri): Unit = js.native
  def deleteFile(uri: Uri, options: Unit, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  def deleteFile(uri: Uri, options: IgnoreIfNotExists): Unit = js.native
  def deleteFile(uri: Uri, options: IgnoreIfNotExists, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  
  /**
    * Get all text edits grouped by resource.
    *
    * @return A shallow copy of `[Uri, TextEdit[]]`-tuples.
    */
  def entries(): js.Array[js.Tuple2[Uri, js.Array[TextEdit]]] = js.native
  
  /**
    * Get the text edits for a resource.
    *
    * @param uri A resource identifier.
    * @return An array of text edits.
    */
  def get(uri: Uri): js.Array[TextEdit] = js.native
  
  /**
    * Check if a text edit for a resource exists.
    *
    * @param uri A resource identifier.
    * @return `true` if the given resource will be touched by this edit.
    */
  def has(uri: Uri): Boolean = js.native
  
  /**
    * Insert the given text at the given position.
    *
    * @param uri A resource identifier.
    * @param position A position.
    * @param newText A string.
    * @param metadata Optional metadata for the entry.
    */
  def insert(uri: Uri, position: Position, newText: String): Unit = js.native
  def insert(uri: Uri, position: Position, newText: String, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  
  /**
    * Rename a file or folder.
    *
    * @param oldUri The existing file.
    * @param newUri The new location.
    * @param options Defines if existing files should be overwritten or be
    * ignored. When overwrite and ignoreIfExists are both set overwrite wins.
    * @param metadata Optional metadata for the entry.
    */
  def renameFile(oldUri: Uri, newUri: Uri): Unit = js.native
  def renameFile(oldUri: Uri, newUri: Uri, options: Unit, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  def renameFile(oldUri: Uri, newUri: Uri, options: IgnoreIfExists): Unit = js.native
  def renameFile(oldUri: Uri, newUri: Uri, options: IgnoreIfExists, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  
  /**
    * Replace the given range with given text for the given resource.
    *
    * @param uri A resource identifier.
    * @param range A range.
    * @param newText A string.
    * @param metadata Optional metadata for the entry.
    */
  def replace(uri: Uri, range: Range, newText: String): Unit = js.native
  def replace(uri: Uri, range: Range, newText: String, metadata: WorkspaceEditEntryMetadata): Unit = js.native
  
  /**
    * Set (and replace) notebook edits for a resource.
    *
    * @param uri A resource identifier.
    * @param edits An array of edits.
    */
  /**
    * Set (and replace) notebook edits with metadata for a resource.
    *
    * @param uri A resource identifier.
    * @param edits An array of edits.
    */
  /**
    * Set (and replace) text edits or snippet edits for a resource.
    *
    * @param uri A resource identifier.
    * @param edits An array of edits.
    */
  /**
    * Set (and replace) text edits or snippet edits with metadata for a resource.
    *
    * @param uri A resource identifier.
    * @param edits An array of edits.
    */
  def set(
    uri: Uri,
    edits: js.Array[
      NotebookEdit | SnippetTextEdit | TextEdit | (js.Tuple2[NotebookEdit | SnippetTextEdit | TextEdit, WorkspaceEditEntryMetadata])
    ]
  ): Unit = js.native
  
  /**
    * The number of affected resources of textual or resource changes.
    */
  val size: Double = js.native
}
