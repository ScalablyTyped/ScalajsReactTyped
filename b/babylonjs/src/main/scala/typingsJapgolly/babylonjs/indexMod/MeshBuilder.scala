package typingsJapgolly.babylonjs.indexMod

import typingsJapgolly.babylonjs.anon.AdjustFrame
import typingsJapgolly.babylonjs.anon.AlignHorizontal
import typingsJapgolly.babylonjs.anon.AlphaFilter
import typingsJapgolly.babylonjs.anon.Arc
import typingsJapgolly.babylonjs.anon.BackUVs
import typingsJapgolly.babylonjs.anon.Clip
import typingsJapgolly.babylonjs.anon.CloseArray
import typingsJapgolly.babylonjs.anon.CloseShape
import typingsJapgolly.babylonjs.anon.Colors
import typingsJapgolly.babylonjs.anon.Custom
import typingsJapgolly.babylonjs.anon.DashNb
import typingsJapgolly.babylonjs.anon.Depth
import typingsJapgolly.babylonjs.anon.DiameterX
import typingsJapgolly.babylonjs.anon.FaceColors
import typingsJapgolly.babylonjs.anon.Flat
import typingsJapgolly.babylonjs.anon.FrontUVs
import typingsJapgolly.babylonjs.anon.Holes
import typingsJapgolly.babylonjs.anon.Instance
import typingsJapgolly.babylonjs.anon.InvertUV
import typingsJapgolly.babylonjs.anon.P
import typingsJapgolly.babylonjs.anon.Pattern
import typingsJapgolly.babylonjs.anon.Precision
import typingsJapgolly.babylonjs.anon.SideOrientation
import typingsJapgolly.babylonjs.anon.Subdivisions
import typingsJapgolly.babylonjs.anon.Tessellation
import typingsJapgolly.babylonjs.meshesBuildersCapsuleBuilderMod.ICreateCapsuleOptions
import typingsJapgolly.babylonjs.meshesBuildersGoldbergBuilderMod.GoldbergCreationOption
import typingsJapgolly.babylonjs.meshesMeshMod.Mesh
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MeshBuilder {
  
  @JSImport("babylonjs/index", "MeshBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateBox")
  @js.native
  def CreateBox: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[BackUVs], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateBox(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: BackUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox(name: String, options: BackUVs, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[BackUVs], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateBox")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateCapsule")
  @js.native
  def CreateCapsule: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[ICreateCapsuleOptions], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateCapsule(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule(
    name: String,
    options: ICreateCapsuleOptions,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCapsule_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[ICreateCapsuleOptions], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCapsule")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateCylinder")
  @js.native
  def CreateCylinder: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Arc], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateCylinder(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Arc): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder(name: String, options: Arc, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateCylinder_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Arc], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCylinder")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateDashedLines")
  @js.native
  def CreateDashedLines: js.Function3[
    /* name */ String, 
    /* options */ DashNb, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateDashedLines(name: String, options: DashNb): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateDashedLines(name: String, options: DashNb, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateDashedLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ DashNb, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateDecal")
  @js.native
  def CreateDecal: js.Function3[
    /* name */ String, 
    /* sourceMesh */ typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh, 
    /* options */ typingsJapgolly.babylonjs.anon.Angle, 
    Mesh
  ] = js.native
  inline def CreateDecal(
    name: String,
    sourceMesh: typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh,
    options: typingsJapgolly.babylonjs.anon.Angle
  ): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDecal_=(
    x: js.Function3[
      /* name */ String, 
      /* sourceMesh */ typingsJapgolly.babylonjs.meshesAbstractMeshMod.AbstractMesh, 
      /* options */ typingsJapgolly.babylonjs.anon.Angle, 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateDisc")
  @js.native
  def CreateDisc: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[FrontUVs], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateDisc(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: FrontUVs): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc(name: String, options: FrontUVs, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateDisc_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[FrontUVs], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisc")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateGeodesic")
  @js.native
  def CreateGeodesic: js.Function3[
    /* name */ String, 
    /* options */ FaceColors, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateGeodesic(name: String, options: FaceColors): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateGeodesic(name: String, options: FaceColors, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateGeodesic_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ FaceColors, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGeodesic")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateGoldberg")
  @js.native
  def CreateGoldberg: js.Function3[
    /* name */ String, 
    /* options */ GoldbergCreationOption, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh
  ] = js.native
  inline def CreateGoldberg(name: String, options: GoldbergCreationOption): typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh]
  inline def CreateGoldberg(
    name: String,
    options: GoldbergCreationOption,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh]
  inline def CreateGoldberg_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ GoldbergCreationOption, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      typingsJapgolly.babylonjs.meshesGoldbergMeshMod.GoldbergMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGoldberg")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateGround")
  @js.native
  def CreateGround: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Subdivisions], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
    typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh
  ] = js.native
  inline def CreateGround(name: String): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Unit, scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions, scene: typingsJapgolly.babylonjs.sceneMod.Scene): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap: js.Function4[
    /* name */ String, 
    /* url */ String, 
    /* options */ js.UndefOr[AlphaFilter], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh
  ] = js.native
  inline def CreateGroundFromHeightMap(name: String, url: String): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    options: Unit,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: AlphaFilter): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    options: AlphaFilter,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]
  ): typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh]
  inline def CreateGroundFromHeightMap_=(
    x: js.Function4[
      /* name */ String, 
      /* url */ String, 
      /* options */ js.UndefOr[AlphaFilter], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGroundFromHeightMap")(x.asInstanceOf[js.Any])
  
  inline def CreateGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Subdivisions], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
      typingsJapgolly.babylonjs.meshesGroundMeshMod.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGround")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateIcoSphere")
  @js.native
  def CreateIcoSphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Flat], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateIcoSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Flat): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere(name: String, options: Flat, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateIcoSphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Flat], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateIcoSphere")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateLathe")
  @js.native
  def CreateLathe: js.Function3[
    /* name */ String, 
    /* options */ Clip, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateLathe(name: String, options: Clip): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateLathe(name: String, options: Clip, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateLathe_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Clip, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLathe")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateLineSystem")
  @js.native
  def CreateLineSystem: js.Function3[
    /* name */ String, 
    /* options */ Colors, 
    /* scene */ Nullable[typingsJapgolly.babylonjs.sceneMod.Scene], 
    typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateLineSystem(name: String, options: Colors, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLineSystem_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Colors, 
      /* scene */ Nullable[typingsJapgolly.babylonjs.sceneMod.Scene], 
      typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateLines")
  @js.native
  def CreateLines: js.Function3[
    /* name */ String, 
    /* options */ Instance, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
  ] = js.native
  inline def CreateLines(name: String, options: Instance): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLines(name: String, options: Instance, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh]
  inline def CreateLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Instance, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      typingsJapgolly.babylonjs.meshesLinesMeshMod.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreatePlane")
  @js.native
  def CreatePlane: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[SideOrientation], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreatePlane(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreatePlane(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePlane(name: String, options: SideOrientation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePlane(name: String, options: SideOrientation, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[SideOrientation], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePlane")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreatePolygon")
  @js.native
  def CreatePolygon: js.Function4[
    /* name */ String, 
    /* options */ Depth, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    Mesh
  ] = js.native
  inline def CreatePolygon(name: String, options: Depth): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(name: String, options: Depth, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon(
    name: String,
    options: Depth,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    earcutInjection: Any
  ): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ Depth, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolygon")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreatePolyhedron")
  @js.native
  def CreatePolyhedron: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Custom], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreatePolyhedron(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolyhedron(name: String, options: Custom): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolyhedron(name: String, options: Custom, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreatePolyhedron_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Custom], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolyhedron")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateRibbon")
  @js.native
  def CreateRibbon: js.Function3[
    /* name */ String, 
    /* options */ CloseArray, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateRibbon(name: String, options: CloseArray): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateRibbon(name: String, options: CloseArray, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateRibbon_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ CloseArray, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateRibbon")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateSphere")
  @js.native
  def CreateSphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[DiameterX], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateSphere(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: DiameterX): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere(name: String, options: DiameterX, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateSphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[DiameterX], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateSphere")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateTiledBox")
  @js.native
  def CreateTiledBox: js.Function3[
    /* name */ String, 
    /* options */ AlignHorizontal, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledBox(name: String, options: AlignHorizontal): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox(name: String, options: AlignHorizontal, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AlignHorizontal, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledBox")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateTiledGround")
  @js.native
  def CreateTiledGround: js.Function3[
    /* name */ String, 
    /* options */ Precision, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledGround(name: String, options: Precision): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Precision, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledGround")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateTiledPlane")
  @js.native
  def CreateTiledPlane: js.Function3[
    /* name */ String, 
    /* options */ Pattern, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateTiledPlane(name: String, options: Pattern): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledPlane(name: String, options: Pattern, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTiledPlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Pattern, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledPlane")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateTorus")
  @js.native
  def CreateTorus: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Tessellation], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateTorus(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Unit, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorus(name: String, options: Tessellation, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateTorusKnot")
  @js.native
  def CreateTorusKnot: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[P], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
    Mesh
  ] = js.native
  inline def CreateTorusKnot(name: String): Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot(name: String, options: P, scene: typingsJapgolly.babylonjs.sceneMod.Scene): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTorusKnot_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[P], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
  
  inline def CreateTorus_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Tessellation], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.sceneMod.Scene], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorus")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.CreateTube")
  @js.native
  def CreateTube: js.Function3[
    /* name */ String, 
    /* options */ InvertUV, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def CreateTube(name: String, options: InvertUV): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTube(name: String, options: InvertUV, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def CreateTube_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ InvertUV, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTube")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.ExtrudePolygon")
  @js.native
  def ExtrudePolygon: js.Function4[
    /* name */ String, 
    /* options */ Holes, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    Mesh
  ] = js.native
  inline def ExtrudePolygon(name: String, options: Holes): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Unit, earcutInjection: Any): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(name: String, options: Holes, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon(
    name: String,
    options: Holes,
    scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene],
    earcutInjection: Any
  ): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ Holes, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudePolygon")(x.asInstanceOf[js.Any])
  
  @JSImport("babylonjs/index", "MeshBuilder.ExtrudeShape")
  @js.native
  def ExtrudeShape: js.Function3[
    /* name */ String, 
    /* options */ AdjustFrame, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def ExtrudeShape(name: String, options: AdjustFrame): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShape(name: String, options: AdjustFrame, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  
  @JSImport("babylonjs/index", "MeshBuilder.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom: js.Function3[
    /* name */ String, 
    /* options */ CloseShape, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
    Mesh
  ] = js.native
  inline def ExtrudeShapeCustom(name: String, options: CloseShape): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShapeCustom(name: String, options: CloseShape, scene: Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]): Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Mesh]
  inline def ExtrudeShapeCustom_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ CloseShape, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShapeCustom")(x.asInstanceOf[js.Any])
  
  inline def ExtrudeShape_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AdjustFrame, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.sceneMod.Scene]], 
      Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShape")(x.asInstanceOf[js.Any])
}
