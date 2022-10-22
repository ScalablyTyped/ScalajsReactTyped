package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.GoldbergCreationOption
import typingsJapgolly.babylonjs.BABYLON.ICreateCapsuleOptions
import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.anon.AlignHorizontalAlignVertical
import typingsJapgolly.babylonjs.anon.BackUVsFrontUVs
import typingsJapgolly.babylonjs.anon.CaptureUVS
import typingsJapgolly.babylonjs.anon.Closed
import typingsJapgolly.babylonjs.anon.ColorFilter
import typingsJapgolly.babylonjs.anon.DepthFaceColors
import typingsJapgolly.babylonjs.anon.DiameterFrontUVs
import typingsJapgolly.babylonjs.anon.Enclose
import typingsJapgolly.babylonjs.anon.FirstNormal
import typingsJapgolly.babylonjs.anon.HeightPattern
import typingsJapgolly.babylonjs.anon.M
import typingsJapgolly.babylonjs.anon.PathArray
import typingsJapgolly.babylonjs.anon.Points
import typingsJapgolly.babylonjs.anon.Precision
import typingsJapgolly.babylonjs.anon.RadiusFunction
import typingsJapgolly.babylonjs.anon.RadiusZ
import typingsJapgolly.babylonjs.anon.RibbonCloseArray
import typingsJapgolly.babylonjs.anon.Shape
import typingsJapgolly.babylonjs.anon.SizeY
import typingsJapgolly.babylonjs.anon.Slice
import typingsJapgolly.babylonjs.anon.SourcePlane
import typingsJapgolly.babylonjs.anon.Subdivisions
import typingsJapgolly.babylonjs.anon.Tube
import typingsJapgolly.babylonjs.anon.UseVertexAlpha
import typingsJapgolly.babylonjs.anon.Wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MeshBuilder {
  
  @JSGlobal("BABYLON.MeshBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.MeshBuilder.CreateBox")
  @js.native
  def CreateBox: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Wrap], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateBox(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, options: Wrap): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateBox(name: String, options: Wrap, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Wrap], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateBox")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateCapsule")
  @js.native
  def CreateCapsule: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[ICreateCapsuleOptions], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateCapsule(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCapsule(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCapsule(name: String, options: ICreateCapsuleOptions): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCapsule(
    name: String,
    options: ICreateCapsuleOptions,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCapsule")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCapsule_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[ICreateCapsuleOptions], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCapsule")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateCylinder")
  @js.native
  def CreateCylinder: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Enclose], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateCylinder(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(name: String, options: Enclose): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder(name: String, options: Enclose, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateCylinder")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateCylinder_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Enclose], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateCylinder")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateDashedLines")
  @js.native
  def CreateDashedLines: js.Function3[
    /* name */ String, 
    /* options */ UseVertexAlpha, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.LinesMesh
  ] = js.native
  inline def CreateDashedLines(name: String, options: UseVertexAlpha): typingsJapgolly.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines(name: String, options: UseVertexAlpha, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDashedLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.LinesMesh]
  inline def CreateDashedLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ UseVertexAlpha, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDashedLines")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateDecal")
  @js.native
  def CreateDecal: js.Function3[
    /* name */ String, 
    /* sourceMesh */ typingsJapgolly.babylonjs.BABYLON.AbstractMesh, 
    /* options */ CaptureUVS, 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateDecal(name: String, sourceMesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, options: CaptureUVS): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDecal")(name.asInstanceOf[js.Any], sourceMesh.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDecal_=(
    x: js.Function3[
      /* name */ String, 
      /* sourceMesh */ typingsJapgolly.babylonjs.BABYLON.AbstractMesh, 
      /* options */ CaptureUVS, 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDecal")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateDisc")
  @js.native
  def CreateDisc: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[BackUVsFrontUVs], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateDisc(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(name: String, options: BackUVsFrontUVs): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc(name: String, options: BackUVsFrontUVs, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDisc")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateDisc_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[BackUVsFrontUVs], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateDisc")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateGeodesic")
  @js.native
  def CreateGeodesic: js.Function3[
    /* name */ String, 
    /* options */ M, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateGeodesic(name: String, options: M): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateGeodesic(name: String, options: M, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGeodesic")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateGeodesic_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ M, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGeodesic")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateGoldberg")
  @js.native
  def CreateGoldberg: js.Function3[
    /* name */ String, 
    /* options */ GoldbergCreationOption, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.GoldbergMesh
  ] = js.native
  inline def CreateGoldberg(name: String, options: GoldbergCreationOption): typingsJapgolly.babylonjs.BABYLON.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GoldbergMesh]
  inline def CreateGoldberg(
    name: String,
    options: GoldbergCreationOption,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ): typingsJapgolly.babylonjs.BABYLON.GoldbergMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGoldberg")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GoldbergMesh]
  inline def CreateGoldberg_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ GoldbergCreationOption, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.GoldbergMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGoldberg")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateGround")
  @js.native
  def CreateGround: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Subdivisions], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene], 
    typingsJapgolly.babylonjs.BABYLON.GroundMesh
  ] = js.native
  inline def CreateGround(name: String): typingsJapgolly.babylonjs.BABYLON.GroundMesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGround(name: String, options: Unit, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGround(name: String, options: Subdivisions, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  
  @JSGlobal("BABYLON.MeshBuilder.CreateGroundFromHeightMap")
  @js.native
  def CreateGroundFromHeightMap: js.Function4[
    /* name */ String, 
    /* url */ String, 
    /* options */ js.UndefOr[ColorFilter], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.GroundMesh
  ] = js.native
  inline def CreateGroundFromHeightMap(name: String, url: String): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(name: String, url: String, options: ColorFilter): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap(
    name: String,
    url: String,
    options: ColorFilter,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ): typingsJapgolly.babylonjs.BABYLON.GroundMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateGroundFromHeightMap")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.GroundMesh]
  inline def CreateGroundFromHeightMap_=(
    x: js.Function4[
      /* name */ String, 
      /* url */ String, 
      /* options */ js.UndefOr[ColorFilter], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGroundFromHeightMap")(x.asInstanceOf[js.Any])
  
  inline def CreateGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Subdivisions], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene], 
      typingsJapgolly.babylonjs.BABYLON.GroundMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateGround")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateIcoSphere")
  @js.native
  def CreateIcoSphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[RadiusZ], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateIcoSphere(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateIcoSphere(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateIcoSphere(name: String, options: RadiusZ): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateIcoSphere(name: String, options: RadiusZ, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateIcoSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateIcoSphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[RadiusZ], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateIcoSphere")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateLathe")
  @js.native
  def CreateLathe: js.Function3[
    /* name */ String, 
    /* options */ Closed, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateLathe(name: String, options: Closed): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateLathe(name: String, options: Closed, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLathe")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateLathe_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Closed, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLathe")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateLineSystem")
  @js.native
  def CreateLineSystem: js.Function3[
    /* name */ String, 
    /* options */ typingsJapgolly.babylonjs.anon.Material, 
    /* scene */ Nullable[typingsJapgolly.babylonjs.BABYLON.Scene], 
    typingsJapgolly.babylonjs.BABYLON.LinesMesh
  ] = js.native
  inline def CreateLineSystem(
    name: String,
    options: typingsJapgolly.babylonjs.anon.Material,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ): typingsJapgolly.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLineSystem")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.LinesMesh]
  inline def CreateLineSystem_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ typingsJapgolly.babylonjs.anon.Material, 
      /* scene */ Nullable[typingsJapgolly.babylonjs.BABYLON.Scene], 
      typingsJapgolly.babylonjs.BABYLON.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLineSystem")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateLines")
  @js.native
  def CreateLines: js.Function3[
    /* name */ String, 
    /* options */ Points, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.LinesMesh
  ] = js.native
  inline def CreateLines(name: String, options: Points): typingsJapgolly.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.LinesMesh]
  inline def CreateLines(name: String, options: Points, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.LinesMesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateLines")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.LinesMesh]
  inline def CreateLines_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Points, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.LinesMesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateLines")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreatePlane")
  @js.native
  def CreatePlane: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[SourcePlane], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreatePlane(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePlane(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePlane(name: String, options: SourcePlane): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePlane(name: String, options: SourcePlane, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[SourcePlane], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePlane")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreatePolygon")
  @js.native
  def CreatePolygon: js.Function4[
    /* name */ String, 
    /* options */ Shape, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreatePolygon(name: String, options: Shape): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(name: String, options: Shape, scene: Unit, earcutInjection: Any): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(name: String, options: Shape, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon(
    name: String,
    options: Shape,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    earcutInjection: Any
  ): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ Shape, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolygon")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreatePolyhedron")
  @js.native
  def CreatePolyhedron: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[SizeY], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreatePolyhedron(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron(name: String, options: SizeY): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron(name: String, options: SizeY, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreatePolyhedron")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreatePolyhedron_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[SizeY], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreatePolyhedron")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateRibbon")
  @js.native
  def CreateRibbon: js.Function3[
    /* name */ String, 
    /* options */ PathArray, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateRibbon(name: String, options: PathArray): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon(name: String, options: PathArray, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateRibbon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateRibbon_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ PathArray, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateRibbon")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateSphere")
  @js.native
  def CreateSphere: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Slice], 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateSphere(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(name: String, options: Unit, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(name: String, options: Slice): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateSphere(name: String, options: Slice, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateSphere")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateSphere_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Slice], 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateSphere")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateTiledBox")
  @js.native
  def CreateTiledBox: js.Function3[
    /* name */ String, 
    /* options */ AlignHorizontalAlignVertical, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTiledBox(name: String, options: AlignHorizontalAlignVertical): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTiledBox(
    name: String,
    options: AlignHorizontalAlignVertical,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]
  ): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledBox")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTiledBox_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ AlignHorizontalAlignVertical, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledBox")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateTiledGround")
  @js.native
  def CreateTiledGround: js.Function3[
    /* name */ String, 
    /* options */ Precision, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTiledGround(name: String, options: Precision): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTiledGround(name: String, options: Precision, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledGround")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTiledGround_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ Precision, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledGround")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateTiledPlane")
  @js.native
  def CreateTiledPlane: js.Function3[
    /* name */ String, 
    /* options */ HeightPattern, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTiledPlane(name: String, options: HeightPattern): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTiledPlane(name: String, options: HeightPattern, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTiledPlane")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTiledPlane_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ HeightPattern, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTiledPlane")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateTorus")
  @js.native
  def CreateTorus: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[DiameterFrontUVs], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTorus(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(name: String, options: Unit, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(name: String, options: DiameterFrontUVs): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorus(name: String, options: DiameterFrontUVs, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorus")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  
  @JSGlobal("BABYLON.MeshBuilder.CreateTorusKnot")
  @js.native
  def CreateTorusKnot: js.Function3[
    /* name */ String, 
    /* options */ js.UndefOr[Tube], 
    /* scene */ js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTorusKnot(name: String): typingsJapgolly.babylonjs.BABYLON.Mesh = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(name: String, options: Unit, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(name: String, options: Tube): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot(name: String, options: Tube, scene: typingsJapgolly.babylonjs.BABYLON.Scene): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTorusKnot")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTorusKnot_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[Tube], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorusKnot")(x.asInstanceOf[js.Any])
  
  inline def CreateTorus_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ js.UndefOr[DiameterFrontUVs], 
      /* scene */ js.UndefOr[typingsJapgolly.babylonjs.BABYLON.Scene], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTorus")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.CreateTube")
  @js.native
  def CreateTube: js.Function3[
    /* name */ String, 
    /* options */ RadiusFunction, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def CreateTube(name: String, options: RadiusFunction): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTube(name: String, options: RadiusFunction, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateTube")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def CreateTube_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ RadiusFunction, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateTube")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.ExtrudePolygon")
  @js.native
  def ExtrudePolygon: js.Function4[
    /* name */ String, 
    /* options */ DepthFaceColors, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    /* earcutInjection */ js.UndefOr[Any], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def ExtrudePolygon(name: String, options: DepthFaceColors): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(name: String, options: DepthFaceColors, scene: Unit, earcutInjection: Any): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(name: String, options: DepthFaceColors, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon(
    name: String,
    options: DepthFaceColors,
    scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene],
    earcutInjection: Any
  ): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudePolygon")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], earcutInjection.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudePolygon_=(
    x: js.Function4[
      /* name */ String, 
      /* options */ DepthFaceColors, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      /* earcutInjection */ js.UndefOr[Any], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudePolygon")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MeshBuilder.ExtrudeShape")
  @js.native
  def ExtrudeShape: js.Function3[
    /* name */ String, 
    /* options */ FirstNormal, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def ExtrudeShape(name: String, options: FirstNormal): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShape(name: String, options: FirstNormal, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShape")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  
  @JSGlobal("BABYLON.MeshBuilder.ExtrudeShapeCustom")
  @js.native
  def ExtrudeShapeCustom: js.Function3[
    /* name */ String, 
    /* options */ RibbonCloseArray, 
    /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
    typingsJapgolly.babylonjs.BABYLON.Mesh
  ] = js.native
  inline def ExtrudeShapeCustom(name: String, options: RibbonCloseArray): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom(name: String, options: RibbonCloseArray, scene: Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]): typingsJapgolly.babylonjs.BABYLON.Mesh = (^.asInstanceOf[js.Dynamic].applyDynamic("ExtrudeShapeCustom")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.BABYLON.Mesh]
  inline def ExtrudeShapeCustom_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ RibbonCloseArray, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShapeCustom")(x.asInstanceOf[js.Any])
  
  inline def ExtrudeShape_=(
    x: js.Function3[
      /* name */ String, 
      /* options */ FirstNormal, 
      /* scene */ js.UndefOr[Nullable[typingsJapgolly.babylonjs.BABYLON.Scene]], 
      typingsJapgolly.babylonjs.BABYLON.Mesh
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ExtrudeShape")(x.asInstanceOf[js.Any])
}
