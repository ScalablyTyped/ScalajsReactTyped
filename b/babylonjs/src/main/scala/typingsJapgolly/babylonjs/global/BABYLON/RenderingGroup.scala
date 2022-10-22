package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RenderingGroup")
@js.native
open class RenderingGroup protected ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.RenderingGroup {
  /**
    * Creates a new rendering group.
    * @param index The rendering group index
    * @param scene
    * @param opaqueSortCompareFn The opaque sort comparison function. If null no order is applied
    * @param alphaTestSortCompareFn The alpha test sort comparison function. If null no order is applied
    * @param transparentSortCompareFn The transparent sort comparison function. If null back to front + alpha index sort is applied
    */
  def this(index: Double, scene: typingsJapgolly.babylonjs.BABYLON.Scene) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Unit,
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Unit,
    alphaTestSortCompareFn: Unit,
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Unit,
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Unit,
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
  def this(
    index: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    opaqueSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ],
    alphaTestSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ],
    transparentSortCompareFn: Nullable[
        js.Function2[
          /* a */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          /* b */ typingsJapgolly.babylonjs.BABYLON.SubMesh, 
          Double
        ]
      ]
  ) = this()
}
/* static members */
object RenderingGroup {
  
  @JSGlobal("BABYLON.RenderingGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are grouped by material then geometry.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def PainterSortCompare(a: typingsJapgolly.babylonjs.BABYLON.SubMesh, b: typingsJapgolly.babylonjs.BABYLON.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("PainterSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Renders the submeshes in a specified order.
    * @param subMeshes The submeshes to sort before render
    * @param sortCompareFn The comparison function use to sort
    * @param camera The camera position use to preprocess the submeshes to help sorting
    * @param transparent Specifies to activate blending if true
    */
  @JSGlobal("BABYLON.RenderingGroup._RenderSorted")
  @js.native
  def _RenderSorted: Any = js.native
  inline def _RenderSorted_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_RenderSorted")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.RenderingGroup._ZeroVector")
  @js.native
  def _ZeroVector: Any = js.native
  inline def _ZeroVector_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_ZeroVector")(x.asInstanceOf[js.Any])
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def backToFrontSortCompare(a: typingsJapgolly.babylonjs.BABYLON.SubMesh, b: typingsJapgolly.babylonjs.BABYLON.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("backToFrontSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered back to front if in the same alpha index.
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def defaultTransparentSortCompare(a: typingsJapgolly.babylonjs.BABYLON.SubMesh, b: typingsJapgolly.babylonjs.BABYLON.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultTransparentSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Build in function which can be applied to ensure meshes of a special queue (opaque, alpha test, transparent)
    * are rendered front to back (prevent overdraw).
    *
    * @param a The first submesh
    * @param b The second submesh
    * @returns The result of the comparison
    */
  inline def frontToBackSortCompare(a: typingsJapgolly.babylonjs.BABYLON.SubMesh, b: typingsJapgolly.babylonjs.BABYLON.SubMesh): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("frontToBackSortCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
}
