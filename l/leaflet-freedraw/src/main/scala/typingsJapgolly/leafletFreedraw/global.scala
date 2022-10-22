package typingsJapgolly.leafletFreedraw

import typingsJapgolly.leafletFreedraw.mod.FreeDrawOptions
import typingsJapgolly.leafletFreedraw.mod.default
import typingsJapgolly.leafletFreedraw.mod.localAll
import typingsJapgolly.leafletFreedraw.mod.localAppend
import typingsJapgolly.leafletFreedraw.mod.localCreate
import typingsJapgolly.leafletFreedraw.mod.localDelete
import typingsJapgolly.leafletFreedraw.mod.localEdit
import typingsJapgolly.leafletFreedraw.mod.localEditAppend
import typingsJapgolly.leafletFreedraw.mod.localNone
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * FreeDraw class
    */
  @JSGlobal("LeafletFreeDraw")
  @js.native
  /**
    * Instantiate a new FreeDraw instance, don't forget to add it to leaflet with addLayer
    * @param options Instance options
    */
  open class LeafletFreeDraw () extends default {
    def this(options: FreeDrawOptions) = this()
  }
  object LeafletFreeDraw {
    
    /**
      * Create edit delete and append polygons
      */
    @JSGlobal("LeafletFreeDraw.ALL")
    @js.native
    val ALL: localAll = js.native
    
    /**
      * Append points to an existing polygon
      */
    @JSGlobal("LeafletFreeDraw.APPEND")
    @js.native
    val APPEND: localAppend = js.native
    
    /**
      * Create polygons
      */
    @JSGlobal("LeafletFreeDraw.CREATE")
    @js.native
    val CREATE: localCreate = js.native
    
    /**
      * Delete polygons
      */
    @JSGlobal("LeafletFreeDraw.DELETE")
    @js.native
    val DELETE: localDelete = js.native
    
    /**
      * Edit existing polygons
      */
    @JSGlobal("LeafletFreeDraw.EDIT")
    @js.native
    val EDIT: localEdit = js.native
    
    /**
      * Edit polygons and can append new points to an existing polygon
      */
    @JSGlobal("LeafletFreeDraw.EDIT_APPEND")
    @js.native
    val EDIT_APPEND: localEditAppend = js.native
    
    /**
      * Deactivate FreeDraw
      */
    @JSGlobal("LeafletFreeDraw.NONE")
    @js.native
    val NONE: localNone = js.native
  }
}
